package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataRepositoryConfiguration extends StObject {
  
  /**
    * Specifies the type of updated objects (new, changed, deleted) that will be automatically exported from your file system to the linked S3 bucket.
    */
  var AutoExportPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.AutoExportPolicy] = js.undefined
  
  /**
    * Specifies the type of updated objects (new, changed, deleted) that will be automatically imported from the linked S3 bucket to your file system.
    */
  var AutoImportPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.AutoImportPolicy] = js.undefined
}
object S3DataRepositoryConfiguration {
  
  inline def apply(): S3DataRepositoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DataRepositoryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DataRepositoryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAutoExportPolicy(value: AutoExportPolicy): Self = StObject.set(x, "AutoExportPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoExportPolicyUndefined: Self = StObject.set(x, "AutoExportPolicy", js.undefined)
    
    inline def setAutoImportPolicy(value: AutoImportPolicy): Self = StObject.set(x, "AutoImportPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoImportPolicyUndefined: Self = StObject.set(x, "AutoImportPolicy", js.undefined)
  }
}
