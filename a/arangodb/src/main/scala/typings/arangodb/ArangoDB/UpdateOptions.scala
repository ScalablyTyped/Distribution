package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOptions
  extends StObject
     with ReplaceOptions {
  
  var keepNull: js.UndefOr[Boolean] = js.undefined
  
  var mergeObjects: js.UndefOr[Boolean] = js.undefined
}
object UpdateOptions {
  
  inline def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  extension [Self <: UpdateOptions](x: Self) {
    
    inline def setKeepNull(value: Boolean): Self = StObject.set(x, "keepNull", value.asInstanceOf[js.Any])
    
    inline def setKeepNullUndefined: Self = StObject.set(x, "keepNull", js.undefined)
    
    inline def setMergeObjects(value: Boolean): Self = StObject.set(x, "mergeObjects", value.asInstanceOf[js.Any])
    
    inline def setMergeObjectsUndefined: Self = StObject.set(x, "mergeObjects", js.undefined)
  }
}
