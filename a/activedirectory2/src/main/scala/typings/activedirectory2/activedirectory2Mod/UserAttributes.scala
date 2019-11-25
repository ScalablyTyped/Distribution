package typings.activedirectory2.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activedirectory2.activedirectory2Strings.distinguishedName
  - typings.activedirectory2.activedirectory2Strings.userPrincipalName
  - typings.activedirectory2.activedirectory2Strings.sAMAccountName
  - typings.activedirectory2.activedirectory2Strings.mail
  - typings.activedirectory2.activedirectory2Strings.lockoutTime
  - typings.activedirectory2.activedirectory2Strings.whenCreated
  - typings.activedirectory2.activedirectory2Strings.pwdLastSet
  - typings.activedirectory2.activedirectory2Strings.userAccountControl
  - typings.activedirectory2.activedirectory2Strings.employeeID
  - typings.activedirectory2.activedirectory2Strings.sn
  - typings.activedirectory2.activedirectory2Strings.givenName
  - typings.activedirectory2.activedirectory2Strings.initials
  - typings.activedirectory2.activedirectory2Strings.cn
  - typings.activedirectory2.activedirectory2Strings.displayName
  - typings.activedirectory2.activedirectory2Strings.comment
  - typings.activedirectory2.activedirectory2Strings.description
*/
trait UserAttributes extends js.Object

object UserAttributes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cn: typings.activedirectory2.activedirectory2Strings.cn = this.cast("cn")
  @scala.inline
  def comment: typings.activedirectory2.activedirectory2Strings.comment = this.cast("comment")
  @scala.inline
  def description: typings.activedirectory2.activedirectory2Strings.description = this.cast("description")
  @scala.inline
  def displayName: typings.activedirectory2.activedirectory2Strings.displayName = this.cast("displayName")
  @scala.inline
  def distinguishedName: typings.activedirectory2.activedirectory2Strings.distinguishedName = this.cast("distinguishedName")
  @scala.inline
  def employeeID: typings.activedirectory2.activedirectory2Strings.employeeID = this.cast("employeeID")
  @scala.inline
  def givenName: typings.activedirectory2.activedirectory2Strings.givenName = this.cast("givenName")
  @scala.inline
  def initials: typings.activedirectory2.activedirectory2Strings.initials = this.cast("initials")
  @scala.inline
  def lockoutTime: typings.activedirectory2.activedirectory2Strings.lockoutTime = this.cast("lockoutTime")
  @scala.inline
  def mail: typings.activedirectory2.activedirectory2Strings.mail = this.cast("mail")
  @scala.inline
  def pwdLastSet: typings.activedirectory2.activedirectory2Strings.pwdLastSet = this.cast("pwdLastSet")
  @scala.inline
  def sAMAccountName: typings.activedirectory2.activedirectory2Strings.sAMAccountName = this.cast("sAMAccountName")
  @scala.inline
  def sn: typings.activedirectory2.activedirectory2Strings.sn = this.cast("sn")
  @scala.inline
  def userAccountControl: typings.activedirectory2.activedirectory2Strings.userAccountControl = this.cast("userAccountControl")
  @scala.inline
  def userPrincipalName: typings.activedirectory2.activedirectory2Strings.userPrincipalName = this.cast("userPrincipalName")
  @scala.inline
  def whenCreated: typings.activedirectory2.activedirectory2Strings.whenCreated = this.cast("whenCreated")
}

