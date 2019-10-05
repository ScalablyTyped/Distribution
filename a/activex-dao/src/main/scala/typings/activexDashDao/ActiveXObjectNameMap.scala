package typings.activexDashDao

import typings.activexDashDao.DAO.DBEngine
import typings.activexDashDao.DAO.Field
import typings.activexDashDao.DAO.Group
import typings.activexDashDao.DAO.Index
import typings.activexDashDao.DAO.QueryDef
import typings.activexDashDao.DAO.Relation
import typings.activexDashDao.DAO.TableDef
import typings.activexDashDao.DAO.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `DAO.DBEngine`: DBEngine
  var `DAO.Field`: Field
  var `DAO.Group`: Group
  var `DAO.Index`: Index
  var `DAO.PrivateDBEngine`: DBEngine
  var `DAO.QueryDef`: QueryDef
  var `DAO.Relation`: Relation
  var `DAO.TableDef`: TableDef
  var `DAO.User`: User
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `DAO.DBEngine`: DBEngine,
    `DAO.Field`: Field,
    `DAO.Group`: Group,
    `DAO.Index`: Index,
    `DAO.PrivateDBEngine`: DBEngine,
    `DAO.QueryDef`: QueryDef,
    `DAO.Relation`: Relation,
    `DAO.TableDef`: TableDef,
    `DAO.User`: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DAO.DBEngine")(`DAO.DBEngine`)
    __obj.updateDynamic("DAO.Field")(`DAO.Field`)
    __obj.updateDynamic("DAO.Group")(`DAO.Group`)
    __obj.updateDynamic("DAO.Index")(`DAO.Index`)
    __obj.updateDynamic("DAO.PrivateDBEngine")(`DAO.PrivateDBEngine`)
    __obj.updateDynamic("DAO.QueryDef")(`DAO.QueryDef`)
    __obj.updateDynamic("DAO.Relation")(`DAO.Relation`)
    __obj.updateDynamic("DAO.TableDef")(`DAO.TableDef`)
    __obj.updateDynamic("DAO.User")(`DAO.User`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

