package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExportSpecifications extends StObject {
  
  def apply(Index: String): ImportExportSpecification = js.native
  def apply(Index: Double): ImportExportSpecification = js.native
  
  def Add(Name: String, SpecificationDefinition: String): ImportExportSpecification = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): ImportExportSpecification = js.native
  def Item(Index: Double): ImportExportSpecification = js.native
  
  val Parent: Any = js.native
}
