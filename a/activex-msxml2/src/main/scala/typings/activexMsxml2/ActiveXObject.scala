package typings.activexMsxml2

import typings.activexMsxml2.MSXML2.DOMDocument60
import typings.activexMsxml2.MSXML2.FreeThreadedDOMDocument60
import typings.activexMsxml2.activexMsxml2Strings.ondataavailable
import typings.activexMsxml2.activexMsxml2Strings.onreadystatechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  @JSName("on")
  def on_ondataavailable(
    obj: DOMDocument60,
    event: ondataavailable,
    handler: js.ThisFunction1[/* this */ DOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ondataavailable(
    obj: FreeThreadedDOMDocument60,
    event: ondataavailable,
    handler: js.ThisFunction1[/* this */ FreeThreadedDOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_onreadystatechange(
    obj: DOMDocument60,
    event: onreadystatechange,
    handler: js.ThisFunction1[/* this */ DOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_onreadystatechange(
    obj: FreeThreadedDOMDocument60,
    event: onreadystatechange,
    handler: js.ThisFunction1[/* this */ FreeThreadedDOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
