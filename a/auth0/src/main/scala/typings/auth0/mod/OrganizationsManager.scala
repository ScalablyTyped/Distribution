package typings.auth0.mod

import typings.auth0.anon.NameString
import typings.auth0.anon.ObjectWithIdPagingOptions
import typings.auth0.anon.ObjectWithIdPagingOptionsFields
import typings.auth0.anon.ObjectWithIdPagingOptionsId
import typings.auth0.anon.ObjectWithIdPagingOptionsIncludefields
import typings.auth0.anon.ObjectWithIdPagingOptionsIncludetotals
import typings.auth0.anon.ObjectWithIdPagingOptionsPage
import typings.auth0.anon.ObjectWithIdconnectionids
import typings.auth0.anon.ObjectWithIdinvitationids
import typings.auth0.anon.ObjectWithIdinvitationidsId
import typings.auth0.anon.ObjectWithIduseridstring
import typings.auth0.anon.OmitRolePagelength
import typings.auth0.anon.PagingOptionsincludetotal
import typings.auth0.anon.PagingOptionsincludetotalIncludetotals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "OrganizationsManager")
@js.native
open class OrganizationsManager () extends StObject {
  
  def addEnabledConnection(params: ObjectWithId, data: AddOrganizationEnabledConnection): js.Promise[OrganizationConnection] = js.native
  def addEnabledConnection(
    params: ObjectWithId,
    data: AddOrganizationEnabledConnection,
    cb: js.Function2[/* err */ js.Error, /* connection */ OrganizationConnection, Unit]
  ): Unit = js.native
  
  def addMemberRoles(params: ObjectWithIduseridstring, data: AddOrganizationMemberRoles): js.Promise[Unit] = js.native
  def addMemberRoles(
    params: ObjectWithIduseridstring,
    data: AddOrganizationMemberRoles,
    cb: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  
  def addMembers(params: ObjectWithId, data: AddOrganizationMembers): js.Promise[Unit] = js.native
  def addMembers(params: ObjectWithId, data: AddOrganizationMembers, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def create(data: CreateOrganization): js.Promise[Organization] = js.native
  def create(
    data: CreateOrganization,
    cb: js.Function2[/* err */ js.Error, /* organization */ Organization, Unit]
  ): Unit = js.native
  
  def createInvitation(params: ObjectWithId, data: CreateOrganizationInvitation): js.Promise[OrganizationInvitation] = js.native
  def createInvitation(
    params: ObjectWithId,
    data: CreateOrganizationInvitation,
    cb: js.Function2[/* err */ js.Error, /* invitation */ OrganizationInvitation, Unit]
  ): Unit = js.native
  
  def delete(params: ObjectWithId): js.Promise[Unit] = js.native
  def delete(params: ObjectWithId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def deleteInvitation(params: ObjectWithIdinvitationidsId): js.Promise[Unit] = js.native
  def deleteInvitation(params: ObjectWithIdinvitationidsId, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def getAll(): js.Promise[js.Array[Organization]] = js.native
  def getAll(cb: js.Function2[/* err */ js.Error, /* organizations */ js.Array[Organization], Unit]): Unit = js.native
  def getAll(params: PagingOptionsincludetotal): js.Promise[js.Array[Organization]] = js.native
  def getAll(params: PagingOptionsincludetotalIncludetotals): js.Promise[OrganizationsPaged] = js.native
  def getAll(
    params: PagingOptionsincludetotalIncludetotals,
    cb: js.Function2[/* err */ js.Error, /* pagedOrganizations */ OrganizationsPaged, Unit]
  ): Unit = js.native
  def getAll(
    params: PagingOptionsincludetotal,
    cb: js.Function2[/* err */ js.Error, /* organizations */ js.Array[Organization], Unit]
  ): Unit = js.native
  def getAll(params: CheckpointPagingOptions): js.Promise[js.Array[Organization]] = js.native
  def getAll(
    params: CheckpointPagingOptions,
    cb: js.Function2[/* err */ js.Error, /* organizations */ js.Array[Organization], Unit]
  ): Unit = js.native
  
  def getByID(params: ObjectWithId): js.Promise[Organization] = js.native
  def getByID(params: ObjectWithId, cb: js.Function2[/* err */ js.Error, /* organization */ Organization, Unit]): Unit = js.native
  
  def getByName(params: NameString): js.Promise[Organization] = js.native
  def getByName(params: NameString, cb: js.Function2[/* err */ js.Error, /* organization */ Organization, Unit]): Unit = js.native
  
  def getEnabledConnection(params: ObjectWithIdconnectionids): js.Promise[OrganizationConnection] = js.native
  def getEnabledConnection(
    params: ObjectWithIdconnectionids,
    cb: js.Function2[/* err */ js.Error, /* connection */ OrganizationConnection, Unit]
  ): Unit = js.native
  
  def getEnabledConnections(params: ObjectWithId & PagingOptions): js.Promise[js.Array[OrganizationConnection]] = js.native
  def getEnabledConnections(
    params: ObjectWithId & PagingOptions,
    cb: js.Function2[/* err */ js.Error, /* connections */ js.Array[OrganizationConnection], Unit]
  ): Unit = js.native
  
  def getInvitation(params: ObjectWithIdinvitationids): js.Promise[OrganizationInvitation] = js.native
  def getInvitation(
    params: ObjectWithIdinvitationids,
    cb: js.Function2[/* err */ js.Error, /* invitation */ OrganizationInvitation, Unit]
  ): Unit = js.native
  
  def getInvitations(params: ObjectWithIdPagingOptionsFields): js.Promise[js.Array[OrganizationInvitation]] = js.native
  def getInvitations(
    params: ObjectWithIdPagingOptionsFields,
    cb: js.Function2[/* err */ js.Error, /* invitations */ js.Array[OrganizationInvitation], Unit]
  ): Unit = js.native
  def getInvitations(params: ObjectWithIdPagingOptionsIncludefields): js.Promise[OrganizationInvitationsPaged] = js.native
  def getInvitations(
    params: ObjectWithIdPagingOptionsIncludefields,
    cb: js.Function2[/* err */ js.Error, /* pagedInvitations */ OrganizationInvitationsPaged, Unit]
  ): Unit = js.native
  
  def getMemberRoles(params: ObjectWithIdPagingOptionsIncludetotals): js.Promise[js.Array[Role]] = js.native
  def getMemberRoles(
    params: ObjectWithIdPagingOptionsIncludetotals,
    cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[Role], Unit]
  ): Unit = js.native
  def getMemberRoles(params: ObjectWithIdPagingOptionsPage): js.Promise[OmitRolePagelength] = js.native
  def getMemberRoles(
    params: ObjectWithIdPagingOptionsPage,
    cb: js.Function2[/* err */ js.Error, /* roles */ OmitRolePagelength, Unit]
  ): Unit = js.native
  
  def getMembers(params: ObjectWithId & CheckpointPagingOptions): js.Promise[js.Array[OrganizationMember]] = js.native
  def getMembers(
    params: ObjectWithId & CheckpointPagingOptions,
    cb: js.Function2[/* err */ js.Error, /* members */ js.Array[OrganizationMember], Unit]
  ): Unit = js.native
  def getMembers(params: ObjectWithIdPagingOptions): js.Promise[js.Array[OrganizationMember]] = js.native
  def getMembers(params: ObjectWithIdPagingOptionsId): js.Promise[OrganizationMembersPaged] = js.native
  def getMembers(
    params: ObjectWithIdPagingOptionsId,
    cb: js.Function2[/* err */ js.Error, /* pagedMembers */ OrganizationMembersPaged, Unit]
  ): Unit = js.native
  def getMembers(
    params: ObjectWithIdPagingOptions,
    cb: js.Function2[/* err */ js.Error, /* members */ js.Array[OrganizationMember], Unit]
  ): Unit = js.native
  
  def removeEnabledConnection(params: ObjectWithIdconnectionids): js.Promise[Unit] = js.native
  def removeEnabledConnection(params: ObjectWithIdconnectionids, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def removeMemberRoles(params: ObjectWithIduseridstring, data: RemoveOrganizationMemberRoles): js.Promise[Unit] = js.native
  def removeMemberRoles(
    params: ObjectWithIduseridstring,
    data: RemoveOrganizationMemberRoles,
    cb: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  
  def removeMembers(params: ObjectWithId, data: RemoveOrganizationMembers): js.Promise[Unit] = js.native
  def removeMembers(params: ObjectWithId, data: RemoveOrganizationMembers, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def update(params: ObjectWithId, data: UpdateOrganization): js.Promise[Organization] = js.native
  def update(
    params: ObjectWithId,
    data: UpdateOrganization,
    cb: js.Function2[/* err */ js.Error, /* organization */ Organization, Unit]
  ): Unit = js.native
  
  def updateEnabledConnection(params: ObjectWithIdconnectionids, data: UpdateOrganizationEnabledConnection): js.Promise[OrganizationConnection] = js.native
  def updateEnabledConnection(
    params: ObjectWithIdconnectionids,
    data: UpdateOrganizationEnabledConnection,
    cb: js.Function2[/* err */ js.Error, /* connection */ OrganizationConnection, Unit]
  ): Unit = js.native
}
