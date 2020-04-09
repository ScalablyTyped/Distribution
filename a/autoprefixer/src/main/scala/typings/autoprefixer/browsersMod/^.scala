package typings.autoprefixer.browsersMod

import org.scalablytyped.runtime.StringDictionary
import typings.browserslist.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autoprefixer/lib/browsers", JSImport.Namespace)
@js.native
class ^ protected () extends BrowsersImpl {
  def this(data: StringDictionary[js.Any]) = this()
  def this(data: StringDictionary[js.Any], options: js.Any) = this()
  def this(data: StringDictionary[js.Any], options: js.Any, browserslistOpts: Options) = this()
  /* CompleteClass */
  override def isSelected(browser: String): Boolean = js.native
  /* CompleteClass */
  override def parse(queries: Queries): js.Array[String] = js.native
  /* CompleteClass */
  override def prefix(browser: String): String = js.native
}

