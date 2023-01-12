package typings.angularCore.anon

import typings.angularCore.angularCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * If an `@Attribute` decorator is used, this represents the injected attribute's name. If the
    * attribute name is a dynamic expression instead of a string literal, this will be the unknown
    * type.
    */
  var attribute: js.UndefOr[String | Any] = js.undefined
  
  /**
    * If `@Host` is used, this key is set to true.
    */
  var host: js.UndefOr[`true`] = js.undefined
  
  /**
    * If `@Optional()` is used, this key is set to true.
    */
  var optional: js.UndefOr[`true`] = js.undefined
  
  /**
    * If `@Self` is used, this key is set to true.
    */
  var self: js.UndefOr[`true`] = js.undefined
  
  /**
    * If `@SkipSelf` is used, this key is set to true.
    */
  var skipSelf: js.UndefOr[`true`] = js.undefined
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String | Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setHost(value: `true`): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setSelf(value: `true`): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    inline def setSkipSelf(value: `true`): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    inline def setSkipSelfUndefined: Self = StObject.set(x, "skipSelf", js.undefined)
  }
}
