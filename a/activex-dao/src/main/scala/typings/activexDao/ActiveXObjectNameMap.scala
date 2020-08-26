package typings.activexDao

import typings.activexDao.DAO.DBEngine
import typings.activexDao.DAO.Field
import typings.activexDao.DAO.Group
import typings.activexDao.DAO.Index
import typings.activexDao.DAO.QueryDef
import typings.activexDao.DAO.Relation
import typings.activexDao.DAO.TableDef
import typings.activexDao.DAO.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("DAO.DBEngine")
  var DAODotDBEngine: DBEngine = js.native
  @JSName("DAO.Field")
  var DAODotField: Field = js.native
  @JSName("DAO.Group")
  var DAODotGroup: Group = js.native
  @JSName("DAO.Index")
  var DAODotIndex: Index = js.native
  @JSName("DAO.PrivateDBEngine")
  var DAODotPrivateDBEngine: DBEngine = js.native
  @JSName("DAO.QueryDef")
  var DAODotQueryDef: QueryDef = js.native
  @JSName("DAO.Relation")
  var DAODotRelation: Relation = js.native
  @JSName("DAO.TableDef")
  var DAODotTableDef: TableDef = js.native
  @JSName("DAO.User")
  var DAODotUser: User = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    DAODotDBEngine: DBEngine,
    DAODotField: Field,
    DAODotGroup: Group,
    DAODotIndex: Index,
    DAODotPrivateDBEngine: DBEngine,
    DAODotQueryDef: QueryDef,
    DAODotRelation: Relation,
    DAODotTableDef: TableDef,
    DAODotUser: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DAO.DBEngine")(DAODotDBEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Field")(DAODotField.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Group")(DAODotGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Index")(DAODotIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.PrivateDBEngine")(DAODotPrivateDBEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.QueryDef")(DAODotQueryDef.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Relation")(DAODotRelation.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.TableDef")(DAODotTableDef.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.User")(DAODotUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDAODotDBEngine(value: DBEngine): Self = this.set("DAO.DBEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotField(value: Field): Self = this.set("DAO.Field", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotGroup(value: Group): Self = this.set("DAO.Group", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotIndex(value: Index): Self = this.set("DAO.Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotPrivateDBEngine(value: DBEngine): Self = this.set("DAO.PrivateDBEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotQueryDef(value: QueryDef): Self = this.set("DAO.QueryDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotRelation(value: Relation): Self = this.set("DAO.Relation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotTableDef(value: TableDef): Self = this.set("DAO.TableDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setDAODotUser(value: User): Self = this.set("DAO.User", value.asInstanceOf[js.Any])
  }
  
}

