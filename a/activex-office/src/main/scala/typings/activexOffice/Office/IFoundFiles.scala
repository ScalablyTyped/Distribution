package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** For Macintosh only */
// tslint:disable-next-line:interface-name
@js.native
trait IFoundFiles extends js.Object {
  
  def apply(Index: Double): String = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): String = js.native
}
