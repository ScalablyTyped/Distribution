package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentProperties[TApplication] extends js.Object {
  var Application: TApplication = js.native
  var Count: Double = js.native
  var Creator: Double = js.native
  var Parent: js.Any = js.native
  def apply(index: String): DocumentProperty[TApplication] = js.native
  def apply(index: Double): DocumentProperty[TApplication] = js.native
  def Add(Name: String, LinkToContent: Boolean): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: js.Any): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: js.Any, LinkSource: String): DocumentProperty[_] = js.native
  def Item(index: String): DocumentProperty[TApplication] = js.native
  def Item(index: Double): DocumentProperty[TApplication] = js.native
}

