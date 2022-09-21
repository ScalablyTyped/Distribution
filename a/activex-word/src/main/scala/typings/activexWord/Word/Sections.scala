package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sections extends StObject {
  
  def Add(): Section = js.native
  def Add(Range: Any): Section = js.native
  def Add(Range: Any, Start: Any): Section = js.native
  def Add(Range: Unit, Start: Any): Section = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val First: Section = js.native
  
  def Item(Index: Double): Section = js.native
  
  val Last: Section = js.native
  
  var PageSetup: typings.activexWord.Word.PageSetup = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.Sections_typekey")
  var WordDotSections_typekey: Sections = js.native
}
