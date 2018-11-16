package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldAttributeEnum extends js.Object

@JSGlobal("DAO.FieldAttributeEnum")
@js.native
object FieldAttributeEnum extends js.Object {
  @js.native
  sealed trait dbAutoIncrField
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  @js.native
  sealed trait dbDescending
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  @js.native
  sealed trait dbFixedField
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  @js.native
  sealed trait dbHyperlinkField
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  @js.native
  sealed trait dbSystemField
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  @js.native
  sealed trait dbUpdatableField
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  @js.native
  sealed trait dbVariableField
    extends activexDashDaoLib.DAONs.FieldAttributeEnum
  
  /* 16 */ val dbAutoIncrField: dbAutoIncrField with scala.Double = js.native
  /* 1 */ val dbDescending: dbDescending with scala.Double = js.native
  /* 1 */ val dbFixedField: dbFixedField with scala.Double = js.native
  /* 32768 */ val dbHyperlinkField: dbHyperlinkField with scala.Double = js.native
  /* 8192 */ val dbSystemField: dbSystemField with scala.Double = js.native
  /* 32 */ val dbUpdatableField: dbUpdatableField with scala.Double = js.native
  /* 2 */ val dbVariableField: dbVariableField with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.FieldAttributeEnum with scala.Double] = js.native
}

