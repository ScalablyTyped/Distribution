package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofarchive extends js.Object {
  /**
    * tar archiver
    */
  val tarNs: Typeoftar
  /**
    * zip archiver
    */
  val zipNs: Typeofzip
}

object Typeofarchive {
  @scala.inline
  def apply(tarNs: Typeoftar, zipNs: Typeofzip): Typeofarchive = {
    val __obj = js.Dynamic.literal(tarNs = tarNs, zipNs = zipNs)
  
    __obj.asInstanceOf[Typeofarchive]
  }
}

