package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowLevelPermissionDataSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that contains permissions for RLS.
    */
  var Arn: typings.awsSdk.clientsQuicksightMod.Arn
  
  /**
    * The user or group rules associated with the dataset that contains permissions for RLS. By default, FormatVersion is VERSION_1. When FormatVersion is VERSION_1, UserName and GroupName are required. When FormatVersion is VERSION_2, UserARN and GroupARN are required, and Namespace must not exist.
    */
  var FormatVersion: js.UndefOr[RowLevelPermissionFormatVersion] = js.undefined
  
  /**
    * The namespace associated with the dataset that contains permissions for RLS.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
  
  /**
    * The type of permissions to use when interpreting the permissions for RLS. DENY_ACCESS is included for backward compatibility only.
    */
  var PermissionPolicy: RowLevelPermissionPolicy
  
  /**
    * The status of the row-level security permission dataset. If enabled, the status is ENABLED. If disabled, the status is DISABLED.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Status] = js.undefined
}
object RowLevelPermissionDataSet {
  
  inline def apply(Arn: Arn, PermissionPolicy: RowLevelPermissionPolicy): RowLevelPermissionDataSet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PermissionPolicy = PermissionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionDataSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowLevelPermissionDataSet] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setFormatVersion(value: RowLevelPermissionFormatVersion): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
    
    inline def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setPermissionPolicy(value: RowLevelPermissionPolicy): Self = StObject.set(x, "PermissionPolicy", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
