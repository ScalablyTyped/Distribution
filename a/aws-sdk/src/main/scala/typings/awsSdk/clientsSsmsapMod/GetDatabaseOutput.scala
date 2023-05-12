package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabaseOutput extends StObject {
  
  /**
    * The SAP HANA database of an application registered with AWS Systems Manager for SAP.
    */
  var Database: js.UndefOr[typings.awsSdk.clientsSsmsapMod.Database] = js.undefined
  
  /**
    * The tags of a database.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object GetDatabaseOutput {
  
  inline def apply(): GetDatabaseOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatabaseOutput] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
