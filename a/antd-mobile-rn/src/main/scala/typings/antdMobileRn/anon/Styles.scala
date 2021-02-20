package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends StObject {
  
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
}
object Styles {
  
  @scala.inline
  def apply(styles: StringDictionary[RegisteredStyle[_]]): Styles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
