package typings.adone

import typings.node.pathMod.FormatInputPathObject
import typings.node.pathMod.ParsedPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwin32 extends js.Object {
  val delimiter: String = js.native
  val sep: String = js.native
  def basename(p: String): String = js.native
  def basename(p: String, ext: String): String = js.native
  def dirname(p: String): String = js.native
  def extname(p: String): String = js.native
  def format(pP: FormatInputPathObject): String = js.native
  def isAbsolute(p: String): Boolean = js.native
  def join(paths: String*): String = js.native
  def normalize(p: String): String = js.native
  def parse(p: String): ParsedPath = js.native
  def relative(from: String, to: String): String = js.native
  def resolve(pathSegments: String*): String = js.native
}

