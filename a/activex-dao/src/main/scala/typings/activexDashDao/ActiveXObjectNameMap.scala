package typings.activexDashDao

import typings.activexDashDao.DAONs.DBEngine
import typings.activexDashDao.DAONs.Field
import typings.activexDashDao.DAONs.Group
import typings.activexDashDao.DAONs.Index
import typings.activexDashDao.DAONs.QueryDef
import typings.activexDashDao.DAONs.Relation
import typings.activexDashDao.DAONs.TableDef
import typings.activexDashDao.DAONs.User
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

