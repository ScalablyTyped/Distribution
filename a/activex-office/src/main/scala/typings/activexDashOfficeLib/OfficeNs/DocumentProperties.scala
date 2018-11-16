package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentProperties[TApplication] extends js.Object {
  var Application: TApplication = js.native
  var Count: scala.Double = js.native
  var Creator: scala.Double = js.native
  var Parent: js.Any = js.native
  def apply(index: java.lang.String): DocumentProperty[TApplication] = js.native
  def apply(index: scala.Double): DocumentProperty[TApplication] = js.native
  def Add(Name: java.lang.String, LinkToContent: scala.Boolean): DocumentProperty[_] = js.native
  def Add(Name: java.lang.String, LinkToContent: scala.Boolean, Type: MsoDocProperties): DocumentProperty[_] = js.native
  def Add(Name: java.lang.String, LinkToContent: scala.Boolean, Type: MsoDocProperties, Value: js.Any): DocumentProperty[_] = js.native
  def Add(
    Name: java.lang.String,
    LinkToContent: scala.Boolean,
    Type: MsoDocProperties,
    Value: js.Any,
    LinkSource: java.lang.String
  ): DocumentProperty[_] = js.native
  def Item(index: java.lang.String): DocumentProperty[TApplication] = js.native
  def Item(index: scala.Double): DocumentProperty[TApplication] = js.native
}

