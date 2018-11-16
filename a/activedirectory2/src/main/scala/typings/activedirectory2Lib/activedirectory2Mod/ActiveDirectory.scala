package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveDirectory extends js.Object {
  def authenticate(
    username: java.lang.String,
    password: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* authenticated */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def find(opts: ReqProps, callback: js.Function2[/* err */ js.Object, /* results */ FindResult, scala.Unit]): scala.Unit = js.native
  def find(
    opts: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* results */ FindResult, scala.Unit]
  ): scala.Unit = js.native
  def findDeletedObjects(
    opts: ReqProps,
    callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def findDeletedObjects(
    opts: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def findGroup(
    opts: ReqProps,
    groupName: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* group */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def findGroup(
    opts: java.lang.String,
    groupName: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* group */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def findGroups(
    opts: ReqProps,
    groupName: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def findGroups(
    opts: java.lang.String,
    groupName: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def findUser(
    opts: ReqProps,
    username: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* user */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def findUser(
    opts: java.lang.String,
    username: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* user */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def findUsers(
    opts: ReqProps,
    callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def findUsers(
    opts: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], scala.Unit]
  ): scala.Unit = js.native
  def getRootDSE(
    url: java.lang.String,
    attributes: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Object, /* result */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def isUserMemberOf(
    opts: ReqProps,
    username: java.lang.String,
    groupName: java.lang.String,
    callback: js.Function2[/* err */ js.Object, /* res */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

