package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presentations extends StObject {
  
  /** @param Office.MsoTriState [WithWindow=-1] */
  def Add(): Presentation = js.native
  def Add(WithWindow: MsoTriState): Presentation = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def CanCheckOut(FileName: String): Boolean = js.native
  
  def CheckOut(FileName: String): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Any): Presentation = js.native
  
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    */
  def Open(FileName: String): Presentation = js.native
  def Open(FileName: String, ReadOnly: Unit, Untitled: Unit, WithWindow: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: Unit, Untitled: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: Unit, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: Unit, WithWindow: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open2007(FileName: String): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: Unit, Untitled: Unit, WithWindow: Unit, OpenAndRepair: MsoTriState): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: Unit, Untitled: Unit, WithWindow: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: Unit,
    Untitled: Unit,
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: Unit, Untitled: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: Unit,
    Untitled: MsoTriState,
    WithWindow: Unit,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: Unit, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: Unit,
    Untitled: MsoTriState,
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: Unit,
    WithWindow: Unit,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState, Untitled: Unit, WithWindow: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: Unit,
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: MsoTriState,
    WithWindow: Unit,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: MsoTriState,
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    */
  def OpenOld(FileName: String): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: Unit, Untitled: Unit, WithWindow: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: Unit, Untitled: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: Unit, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: Unit, WithWindow: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.Presentations_typekey")
  var PowerPointDotPresentations_typekey: Presentations = js.native
}
