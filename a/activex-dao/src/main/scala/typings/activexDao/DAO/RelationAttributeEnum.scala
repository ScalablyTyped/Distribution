package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`16777216`
import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`256`
import typings.activexDao.activexDaoNumbers.`2`
import typings.activexDao.activexDaoNumbers.`33554432`
import typings.activexDao.activexDaoNumbers.`4096`
import typings.activexDao.activexDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`4096`
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`4`
  - typings.activexDao.activexDaoNumbers.`16777216`
  - typings.activexDao.activexDaoNumbers.`33554432`
  - typings.activexDao.activexDaoNumbers.`1`
  - typings.activexDao.activexDaoNumbers.`256`
*/
trait RelationAttributeEnum extends js.Object

object RelationAttributeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbRelationDeleteCascade: `4096` = this.cast(4096)
  @scala.inline
  def dbRelationDontEnforce: `2` = this.cast(2)
  @scala.inline
  def dbRelationInherited: `4` = this.cast(4)
  @scala.inline
  def dbRelationLeft: `16777216` = this.cast(16777216)
  @scala.inline
  def dbRelationRight: `33554432` = this.cast(33554432)
  @scala.inline
  def dbRelationUnique: `1` = this.cast(1)
  @scala.inline
  def dbRelationUpdateCascade: `256` = this.cast(256)
}

