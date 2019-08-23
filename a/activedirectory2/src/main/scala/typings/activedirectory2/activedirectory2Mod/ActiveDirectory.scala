package typings.activedirectory2.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveDirectory extends js.Object {
  def authenticate(
    username: String,
    password: String,
    callback: js.Function2[/* err */ String, /* authenticated */ Boolean, Unit]
  ): Unit = js.native
  def find(callback: js.Function2[/* err */ js.Object, /* results */ FindResult, Unit]): Unit = js.native
  def find(opts: String, callback: js.Function2[/* err */ js.Object, /* results */ FindResult, Unit]): Unit = js.native
  def find(opts: ReqProps, callback: js.Function2[/* err */ js.Object, /* results */ FindResult, Unit]): Unit = js.native
  def findDeletedObjects(callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], Unit]): Unit = js.native
  def findDeletedObjects(opts: String, callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], Unit]): Unit = js.native
  def findDeletedObjects(
    opts: ReqProps,
    callback: js.Function2[/* err */ js.Object, /* results */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def findGroup(groupName: String, callback: js.Function2[/* err */ js.Object, /* group */ js.Object, Unit]): Unit = js.native
  def findGroup(
    opts: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* group */ js.Object, Unit]
  ): Unit = js.native
  def findGroup(
    opts: ReqProps,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* group */ js.Object, Unit]
  ): Unit = js.native
  def findGroups(
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def findGroups(
    opts: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def findGroups(
    opts: ReqProps,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def findUser(
    opts: String,
    username: String,
    callback: js.Function2[/* err */ js.Object, /* user */ js.Object, Unit]
  ): Unit = js.native
  def findUser(
    opts: ReqProps,
    username: String,
    callback: js.Function2[/* err */ js.Object, /* user */ js.Object, Unit]
  ): Unit = js.native
  def findUser(username: String, callback: js.Function2[/* err */ js.Object, /* user */ js.Object, Unit]): Unit = js.native
  def findUsers(callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]): Unit = js.native
  def findUsers(opts: String, callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]): Unit = js.native
  def findUsers(opts: ReqProps, callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]): Unit = js.native
  def getGroupMembershipForGroup(
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getGroupMembershipForGroup(
    opts: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getGroupMembershipForGroup(
    opts: ReqProps,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getGroupMembershipForUser(
    opts: String,
    username: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getGroupMembershipForUser(
    opts: ReqProps,
    username: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getGroupMembershipForUser(
    username: String,
    callback: js.Function2[/* err */ js.Object, /* groups */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getRootDSE(
    url: String,
    attributes: js.Array[String],
    callback: js.Function2[/* err */ js.Object, /* result */ js.Object, Unit]
  ): Unit = js.native
  def getUsersForGroup(
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getUsersForGroup(
    opts: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def getUsersForGroup(
    opts: ReqProps,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* users */ js.Array[js.Object], Unit]
  ): Unit = js.native
  def groupExists(groupName: String, callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]): Unit = js.native
  def groupExists(
    opts: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
  ): Unit = js.native
  def groupExists(
    opts: ReqProps,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
  ): Unit = js.native
  def isUserMemberOf(
    opts: ReqProps,
    username: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
  ): Unit = js.native
  def isUserMemberOf(
    username: String,
    groupName: String,
    callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
  ): Unit = js.native
  def userExists(
    opts: String,
    username: String,
    callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
  ): Unit = js.native
  def userExists(
    opts: ReqProps,
    username: String,
    callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]
  ): Unit = js.native
  def userExists(username: String, callback: js.Function2[/* err */ js.Object, /* res */ Boolean, Unit]): Unit = js.native
}

