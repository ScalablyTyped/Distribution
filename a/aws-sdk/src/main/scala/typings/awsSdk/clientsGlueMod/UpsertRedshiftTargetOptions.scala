package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRedshiftTargetOptions extends StObject {
  
  /**
    * The name of the connection to use to write to Redshift.
    */
  var ConnectionName: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The physical location of the Redshift table.
    */
  var TableLocation: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The keys used to determine whether to perform an update or insert.
    */
  var UpsertKeys: js.UndefOr[EnclosedInStringPropertiesMinOne] = js.undefined
}
object UpsertRedshiftTargetOptions {
  
  inline def apply(): UpsertRedshiftTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpsertRedshiftTargetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsertRedshiftTargetOptions] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setTableLocation(value: EnclosedInStringProperty): Self = StObject.set(x, "TableLocation", value.asInstanceOf[js.Any])
    
    inline def setTableLocationUndefined: Self = StObject.set(x, "TableLocation", js.undefined)
    
    inline def setUpsertKeys(value: EnclosedInStringPropertiesMinOne): Self = StObject.set(x, "UpsertKeys", value.asInstanceOf[js.Any])
    
    inline def setUpsertKeysUndefined: Self = StObject.set(x, "UpsertKeys", js.undefined)
    
    inline def setUpsertKeysVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "UpsertKeys", js.Array(value*))
  }
}
