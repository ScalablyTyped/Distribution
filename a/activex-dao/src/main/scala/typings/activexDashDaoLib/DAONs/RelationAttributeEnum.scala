package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationAttributeEnum extends js.Object

@JSGlobal("DAO.RelationAttributeEnum")
@js.native
object RelationAttributeEnum extends js.Object {
  @js.native
  sealed trait dbRelationDeleteCascade
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  @js.native
  sealed trait dbRelationDontEnforce
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  @js.native
  sealed trait dbRelationInherited
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  @js.native
  sealed trait dbRelationLeft
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  @js.native
  sealed trait dbRelationRight
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  @js.native
  sealed trait dbRelationUnique
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  @js.native
  sealed trait dbRelationUpdateCascade
    extends activexDashDaoLib.DAONs.RelationAttributeEnum
  
  /* 4096 */ val dbRelationDeleteCascade: dbRelationDeleteCascade with scala.Double = js.native
  /* 2 */ val dbRelationDontEnforce: dbRelationDontEnforce with scala.Double = js.native
  /* 4 */ val dbRelationInherited: dbRelationInherited with scala.Double = js.native
  /* 16777216 */ val dbRelationLeft: dbRelationLeft with scala.Double = js.native
  /* 33554432 */ val dbRelationRight: dbRelationRight with scala.Double = js.native
  /* 1 */ val dbRelationUnique: dbRelationUnique with scala.Double = js.native
  /* 256 */ val dbRelationUpdateCascade: dbRelationUpdateCascade with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.RelationAttributeEnum with scala.Double] = js.native
}

