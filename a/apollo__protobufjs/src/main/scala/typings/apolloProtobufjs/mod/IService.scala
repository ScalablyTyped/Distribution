package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.apolloProtobufjs.mod.AnyNestedObject because Already inherited */ trait IService
  extends StObject
     with INamespace {
  
  /** Method descriptors */
  var methods: StringDictionary[IMethod]
}
object IService {
  
  inline def apply(methods: StringDictionary[IMethod]): IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[IService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IService] (val x: Self) extends AnyVal {
    
    inline def setMethods(value: StringDictionary[IMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
  }
}
