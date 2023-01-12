package typings.activexStdole

import typings.activexStdole.activexStdoleStrings.FontChanged
import typings.activexStdole.activexStdoleStrings.PropertyName
import typings.activexStdole.stdole.StdFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  def on(
    obj: StdFont,
    event: FontChanged,
    argNames: js.Array[PropertyName],
    handler: js.ThisFunction1[/* this */ StdFont, /* parameter */ typings.activexStdole.anon.PropertyName, Unit]
  ): Unit
}
object ActiveXObject {
  
  inline def apply(
    on: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[/* this */ StdFont, /* parameter */ typings.activexStdole.anon.PropertyName, Unit]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    
    inline def setOn(
      value: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[/* this */ StdFont, /* parameter */ typings.activexStdole.anon.PropertyName, Unit]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
  }
}
