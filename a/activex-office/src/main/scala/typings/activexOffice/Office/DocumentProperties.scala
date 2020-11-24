package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentProperties[TApplication] extends js.Object {
  
  def apply(index: String): DocumentProperty[TApplication] = js.native
  def apply(index: Double): DocumentProperty[TApplication] = js.native
  
  def Add(Name: String, LinkToContent: Boolean): DocumentProperty[_] = js.native
  def Add(
    Name: String,
    LinkToContent: Boolean,
    Type: js.UndefOr[scala.Nothing],
    Value: js.UndefOr[scala.Nothing],
    LinkSource: String
  ): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: js.UndefOr[scala.Nothing], Value: js.Any): DocumentProperty[_] = js.native
  def Add(
    Name: String,
    LinkToContent: Boolean,
    Type: js.UndefOr[scala.Nothing],
    Value: js.Any,
    LinkSource: String
  ): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties): DocumentProperty[_] = js.native
  def Add(
    Name: String,
    LinkToContent: Boolean,
    Type: MsoDocProperties,
    Value: js.UndefOr[scala.Nothing],
    LinkSource: String
  ): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: js.Any): DocumentProperty[_] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: js.Any, LinkSource: String): DocumentProperty[_] = js.native
  
  var Application: TApplication = js.native
  
  var Count: Double = js.native
  
  var Creator: Double = js.native
  
  def Item(index: String): DocumentProperty[TApplication] = js.native
  def Item(index: Double): DocumentProperty[TApplication] = js.native
  
  var Parent: js.Any = js.native
}
