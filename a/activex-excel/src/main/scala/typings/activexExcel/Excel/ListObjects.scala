package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObjects extends StObject {
  
  def apply(Index: String): ListObject = js.native
  def apply(Index: Double): ListObject = js.native
  
  /**
    * @param SourceType [SourceType=1]
    * @param XlListObjectHasHeaders [XlListObjectHasHeaders=0]
    */
  def Add(
    SourceType: js.UndefOr[XlListObjectSourceType],
    Source: js.UndefOr[js.Any],
    LinkSource: js.UndefOr[Boolean],
    XlListObjectHasHeaders: js.UndefOr[XlYesNoGuess],
    Destination: js.UndefOr[Range],
    TableStyleName: js.UndefOr[String]
  ): ListObject = js.native
  @JSName("Add")
  def Add_0(
    SourceType: `0`,
    Source: SafeArray[String],
    LinkSource: Boolean,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: Range
  ): ListObject = js.native
  @JSName("Add")
  def Add_0(
    SourceType: `0`,
    Source: SafeArray[String],
    LinkSource: Boolean,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: Range,
    TableStyleName: String
  ): ListObject = js.native
  @JSName("Add")
  def Add_1(SourceType: `1`): ListObject = js.native
  @JSName("Add")
  def Add_1(
    SourceType: `1`,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: Unit,
    Destination: Unit,
    TableStyleName: String
  ): ListObject = js.native
  @JSName("Add")
  def Add_1(SourceType: `1`, Source: Unit, LinkSource: Unit, XlListObjectHasHeaders: XlYesNoGuess): ListObject = js.native
  @JSName("Add")
  def Add_1(
    SourceType: `1`,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: Unit,
    TableStyleName: String
  ): ListObject = js.native
  @JSName("Add")
  def Add_1(SourceType: `1`, Source: Range): ListObject = js.native
  @JSName("Add")
  def Add_1(
    SourceType: `1`,
    Source: Range,
    LinkSource: Unit,
    XlListObjectHasHeaders: Unit,
    Destination: Unit,
    TableStyleName: String
  ): ListObject = js.native
  @JSName("Add")
  def Add_1(SourceType: `1`, Source: Range, LinkSource: Unit, XlListObjectHasHeaders: XlYesNoGuess): ListObject = js.native
  @JSName("Add")
  def Add_1(
    SourceType: `1`,
    Source: Range,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: Unit,
    TableStyleName: String
  ): ListObject = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): ListObject = js.native
  def Item(Index: Double): ListObject = js.native
  
  val Parent: js.Any = js.native
  
  /**
    * @param SourceType [SourceType=1]
    * @param XlListObjectHasHeaders [XlListObjectHasHeaders=0]
    */
  def _Add(): ListObject = js.native
  def _Add(SourceType: Unit, Source: js.Any): ListObject = js.native
  def _Add(SourceType: Unit, Source: js.Any, LinkSource: js.Any): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: Unit, Source: js.Any, LinkSource: js.Any, XlListObjectHasHeaders: XlYesNoGuess): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: js.Any,
    LinkSource: Unit,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: Unit, Source: js.Any, LinkSource: Unit, XlListObjectHasHeaders: XlYesNoGuess): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: js.Any,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: Unit, Source: Unit, LinkSource: js.Any): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: Unit,
    LinkSource: js.Any,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: Unit, Source: Unit, LinkSource: js.Any, XlListObjectHasHeaders: XlYesNoGuess): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: Unit,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: Unit, Source: Unit, LinkSource: Unit, XlListObjectHasHeaders: XlYesNoGuess): ListObject = js.native
  def _Add(
    SourceType: Unit,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType, Source: js.Any): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType, Source: js.Any, LinkSource: js.Any): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: Unit,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType, Source: Unit, LinkSource: js.Any): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: Unit,
    LinkSource: js.Any,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: Unit,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: Unit,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: Unit,
    Destination: js.Any
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: Unit,
    LinkSource: Unit,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  
  def _Default(Index: js.Any): ListObject = js.native
}
