package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypes extends StObject {
  
  /**
    * The type of the object in the base commit of the merge.
    */
  var base: js.UndefOr[ObjectTypeEnum] = js.undefined
  
  /**
    * The type of the object in the destination branch.
    */
  var destination: js.UndefOr[ObjectTypeEnum] = js.undefined
  
  /**
    * The type of the object in the source branch.
    */
  var source: js.UndefOr[ObjectTypeEnum] = js.undefined
}
object ObjectTypes {
  
  inline def apply(): ObjectTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypes] (val x: Self) extends AnyVal {
    
    inline def setBase(value: ObjectTypeEnum): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setDestination(value: ObjectTypeEnum): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setSource(value: ObjectTypeEnum): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
