package typings.autoprefixer.browsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowsersImpl extends Browsers {
  
  def parse(queries: String): js.Array[String] = js.native
  def parse(queries: js.Array[String]): js.Array[String] = js.native
  
  def prefixes(): js.Array[String] = js.native
  
  def withPrefix(value: String): Boolean = js.native
}
