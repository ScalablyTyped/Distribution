package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evaluated extends StObject {
  
  var dynamicItems: Boolean
  
  var dynamicProps: Boolean
  
  var items: js.UndefOr[EvaluatedItems] = js.undefined
  
  var props: js.UndefOr[EvaluatedProperties] = js.undefined
}
object Evaluated {
  
  inline def apply(dynamicItems: Boolean, dynamicProps: Boolean): Evaluated = {
    val __obj = js.Dynamic.literal(dynamicItems = dynamicItems.asInstanceOf[js.Any], dynamicProps = dynamicProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Evaluated] (val x: Self) extends AnyVal {
    
    inline def setDynamicItems(value: Boolean): Self = StObject.set(x, "dynamicItems", value.asInstanceOf[js.Any])
    
    inline def setDynamicProps(value: Boolean): Self = StObject.set(x, "dynamicProps", value.asInstanceOf[js.Any])
    
    inline def setItems(value: EvaluatedItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setProps(value: EvaluatedProperties): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
