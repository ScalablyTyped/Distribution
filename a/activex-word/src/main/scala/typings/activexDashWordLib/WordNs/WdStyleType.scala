package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdStyleType extends js.Object

@JSGlobal("Word.WdStyleType")
@js.native
object WdStyleType extends js.Object {
  @js.native
  sealed trait wdStyleTypeCharacter
    extends activexDashWordLib.WordNs.WdStyleType
  
  @js.native
  sealed trait wdStyleTypeLinked
    extends activexDashWordLib.WordNs.WdStyleType
  
  @js.native
  sealed trait wdStyleTypeList
    extends activexDashWordLib.WordNs.WdStyleType
  
  @js.native
  sealed trait wdStyleTypeParagraph
    extends activexDashWordLib.WordNs.WdStyleType
  
  @js.native
  sealed trait wdStyleTypeParagraphOnly
    extends activexDashWordLib.WordNs.WdStyleType
  
  @js.native
  sealed trait wdStyleTypeTable
    extends activexDashWordLib.WordNs.WdStyleType
  
  /* 2 */ val wdStyleTypeCharacter: wdStyleTypeCharacter with scala.Double = js.native
  /* 6 */ val wdStyleTypeLinked: wdStyleTypeLinked with scala.Double = js.native
  /* 4 */ val wdStyleTypeList: wdStyleTypeList with scala.Double = js.native
  /* 1 */ val wdStyleTypeParagraph: wdStyleTypeParagraph with scala.Double = js.native
  /* 5 */ val wdStyleTypeParagraphOnly: wdStyleTypeParagraphOnly with scala.Double = js.native
  /* 3 */ val wdStyleTypeTable: wdStyleTypeTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdStyleType with scala.Double] = js.native
}

