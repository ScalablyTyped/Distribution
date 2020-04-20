package typings.activedirectory2

import typings.activedirectory2.activedirectory2Strings.cn
import typings.activedirectory2.activedirectory2Strings.comment
import typings.activedirectory2.activedirectory2Strings.description
import typings.activedirectory2.activedirectory2Strings.displayName
import typings.activedirectory2.activedirectory2Strings.distinguishedName
import typings.activedirectory2.activedirectory2Strings.dn
import typings.activedirectory2.activedirectory2Strings.employeeID
import typings.activedirectory2.activedirectory2Strings.givenName
import typings.activedirectory2.activedirectory2Strings.initials
import typings.activedirectory2.activedirectory2Strings.lockoutTime
import typings.activedirectory2.activedirectory2Strings.mail
import typings.activedirectory2.activedirectory2Strings.objectCategory
import typings.activedirectory2.activedirectory2Strings.pwdLastSet
import typings.activedirectory2.activedirectory2Strings.sAMAccountName
import typings.activedirectory2.activedirectory2Strings.sn
import typings.activedirectory2.activedirectory2Strings.userAccountControl
import typings.activedirectory2.activedirectory2Strings.userPrincipalName
import typings.activedirectory2.activedirectory2Strings.whenCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroup extends js.Object {
  var group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]
  var user: js.Tuple17[
    dn, 
    distinguishedName, 
    userPrincipalName, 
    sAMAccountName, 
    mail, 
    lockoutTime, 
    whenCreated, 
    pwdLastSet, 
    userAccountControl, 
    employeeID, 
    sn, 
    givenName, 
    initials, 
    cn, 
    displayName, 
    comment, 
    description
  ]
}

object AnonGroup {
  @scala.inline
  def apply(
    group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory],
    user: js.Tuple17[
      dn, 
      distinguishedName, 
      userPrincipalName, 
      sAMAccountName, 
      mail, 
      lockoutTime, 
      whenCreated, 
      pwdLastSet, 
      userAccountControl, 
      employeeID, 
      sn, 
      givenName, 
      initials, 
      cn, 
      displayName, 
      comment, 
      description
    ]
  ): AnonGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroup]
  }
}

