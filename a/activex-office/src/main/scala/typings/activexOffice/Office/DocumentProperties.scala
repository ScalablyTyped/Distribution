package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentProperties[TApplication] extends StObject {
  
  def apply(index: String): DocumentProperty[TApplication] = js.native
  def apply(index: Double): DocumentProperty[TApplication] = js.native
  
  def Add(Name: String, LinkToContent: Boolean): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: Unit, Value: Any): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: Unit, Value: Any, LinkSource: String): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: Unit, Value: Unit, LinkSource: String): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: Any): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: Any, LinkSource: String): DocumentProperty[Any] = js.native
  def Add(Name: String, LinkToContent: Boolean, Type: MsoDocProperties, Value: Unit, LinkSource: String): DocumentProperty[Any] = js.native
  
  var Application: TApplication = js.native
  
  var Count: Double = js.native
  
  var Creator: Double = js.native
  
  def Item(index: String): DocumentProperty[TApplication] = js.native
  def Item(index: Double): DocumentProperty[TApplication] = js.native
  
  var Parent: Any = js.native
}
