package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueDataCatalogConfigurationDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var DatabaseARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.DatabaseARN
}
object GlueDataCatalogConfigurationDescription {
  
  inline def apply(DatabaseARN: DatabaseARN): GlueDataCatalogConfigurationDescription = {
    val __obj = js.Dynamic.literal(DatabaseARN = DatabaseARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueDataCatalogConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlueDataCatalogConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setDatabaseARN(value: DatabaseARN): Self = StObject.set(x, "DatabaseARN", value.asInstanceOf[js.Any])
  }
}
