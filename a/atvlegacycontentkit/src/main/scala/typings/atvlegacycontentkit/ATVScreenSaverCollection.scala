package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A object describing the available screensaver collection to the Apple TV.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVScreenSaverCollection extends StObject {
  
  /**
    * The ID of the screensaver collection. This is passed back on the query.
    */
  var id: String
  
  /**
    * The name of the collection, as shown to the user.
    */
  var name: String
  
  /**
    * The type of the collection. This must always be 'collection'.
    */
  var `type`: collection
}
object ATVScreenSaverCollection {
  
  inline def apply(id: String, name: String): ATVScreenSaverCollection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collection")
    __obj.asInstanceOf[ATVScreenSaverCollection]
  }
  
  extension [Self <: ATVScreenSaverCollection](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: collection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
