package typings.awsSdk.clientsCleanroomsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CleanRooms extends Service {
  
  /**
    * Retrieves multiple schemas by their identifiers.
    */
  def batchGetSchema(): Request[BatchGetSchemaOutput, AWSError] = js.native
  def batchGetSchema(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetSchemaOutput, Unit]): Request[BatchGetSchemaOutput, AWSError] = js.native
  /**
    * Retrieves multiple schemas by their identifiers.
    */
  def batchGetSchema(params: BatchGetSchemaInput): Request[BatchGetSchemaOutput, AWSError] = js.native
  def batchGetSchema(
    params: BatchGetSchemaInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetSchemaOutput, Unit]
  ): Request[BatchGetSchemaOutput, AWSError] = js.native
  
  @JSName("config")
  var config_CleanRooms: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new collaboration.
    */
  def createCollaboration(): Request[CreateCollaborationOutput, AWSError] = js.native
  def createCollaboration(callback: js.Function2[/* err */ AWSError, /* data */ CreateCollaborationOutput, Unit]): Request[CreateCollaborationOutput, AWSError] = js.native
  /**
    * Creates a new collaboration.
    */
  def createCollaboration(params: CreateCollaborationInput): Request[CreateCollaborationOutput, AWSError] = js.native
  def createCollaboration(
    params: CreateCollaborationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCollaborationOutput, Unit]
  ): Request[CreateCollaborationOutput, AWSError] = js.native
  
  /**
    * Creates a new configured table resource.
    */
  def createConfiguredTable(): Request[CreateConfiguredTableOutput, AWSError] = js.native
  def createConfiguredTable(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfiguredTableOutput, Unit]): Request[CreateConfiguredTableOutput, AWSError] = js.native
  /**
    * Creates a new configured table resource.
    */
  def createConfiguredTable(params: CreateConfiguredTableInput): Request[CreateConfiguredTableOutput, AWSError] = js.native
  def createConfiguredTable(
    params: CreateConfiguredTableInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfiguredTableOutput, Unit]
  ): Request[CreateConfiguredTableOutput, AWSError] = js.native
  
  /**
    * Creates a new analysis rule for a configured table. Currently, only one analysis rule can be created for a given configured table.
    */
  def createConfiguredTableAnalysisRule(): Request[CreateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def createConfiguredTableAnalysisRule(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[CreateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  /**
    * Creates a new analysis rule for a configured table. Currently, only one analysis rule can be created for a given configured table.
    */
  def createConfiguredTableAnalysisRule(params: CreateConfiguredTableAnalysisRuleInput): Request[CreateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def createConfiguredTableAnalysisRule(
    params: CreateConfiguredTableAnalysisRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[CreateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  
  /**
    * Creates a configured table association. A configured table association links a configured table with a collaboration.
    */
  def createConfiguredTableAssociation(): Request[CreateConfiguredTableAssociationOutput, AWSError] = js.native
  def createConfiguredTableAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfiguredTableAssociationOutput, Unit]
  ): Request[CreateConfiguredTableAssociationOutput, AWSError] = js.native
  /**
    * Creates a configured table association. A configured table association links a configured table with a collaboration.
    */
  def createConfiguredTableAssociation(params: CreateConfiguredTableAssociationInput): Request[CreateConfiguredTableAssociationOutput, AWSError] = js.native
  def createConfiguredTableAssociation(
    params: CreateConfiguredTableAssociationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfiguredTableAssociationOutput, Unit]
  ): Request[CreateConfiguredTableAssociationOutput, AWSError] = js.native
  
  /**
    * Creates a membership for a specific collaboration identifier and joins the collaboration.
    */
  def createMembership(): Request[CreateMembershipOutput, AWSError] = js.native
  def createMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateMembershipOutput, Unit]): Request[CreateMembershipOutput, AWSError] = js.native
  /**
    * Creates a membership for a specific collaboration identifier and joins the collaboration.
    */
  def createMembership(params: CreateMembershipInput): Request[CreateMembershipOutput, AWSError] = js.native
  def createMembership(
    params: CreateMembershipInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMembershipOutput, Unit]
  ): Request[CreateMembershipOutput, AWSError] = js.native
  
  /**
    * Deletes a collaboration. It can only be called by the collaboration owner.
    */
  def deleteCollaboration(): Request[DeleteCollaborationOutput, AWSError] = js.native
  def deleteCollaboration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollaborationOutput, Unit]): Request[DeleteCollaborationOutput, AWSError] = js.native
  /**
    * Deletes a collaboration. It can only be called by the collaboration owner.
    */
  def deleteCollaboration(params: DeleteCollaborationInput): Request[DeleteCollaborationOutput, AWSError] = js.native
  def deleteCollaboration(
    params: DeleteCollaborationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollaborationOutput, Unit]
  ): Request[DeleteCollaborationOutput, AWSError] = js.native
  
  /**
    * Deletes a configured table.
    */
  def deleteConfiguredTable(): Request[DeleteConfiguredTableOutput, AWSError] = js.native
  def deleteConfiguredTable(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfiguredTableOutput, Unit]): Request[DeleteConfiguredTableOutput, AWSError] = js.native
  /**
    * Deletes a configured table.
    */
  def deleteConfiguredTable(params: DeleteConfiguredTableInput): Request[DeleteConfiguredTableOutput, AWSError] = js.native
  def deleteConfiguredTable(
    params: DeleteConfiguredTableInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfiguredTableOutput, Unit]
  ): Request[DeleteConfiguredTableOutput, AWSError] = js.native
  
  /**
    * Deletes a configured table analysis rule.
    */
  def deleteConfiguredTableAnalysisRule(): Request[DeleteConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def deleteConfiguredTableAnalysisRule(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[DeleteConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  /**
    * Deletes a configured table analysis rule.
    */
  def deleteConfiguredTableAnalysisRule(params: DeleteConfiguredTableAnalysisRuleInput): Request[DeleteConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def deleteConfiguredTableAnalysisRule(
    params: DeleteConfiguredTableAnalysisRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[DeleteConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  
  /**
    * Deletes a configured table association.
    */
  def deleteConfiguredTableAssociation(): Request[DeleteConfiguredTableAssociationOutput, AWSError] = js.native
  def deleteConfiguredTableAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfiguredTableAssociationOutput, Unit]
  ): Request[DeleteConfiguredTableAssociationOutput, AWSError] = js.native
  /**
    * Deletes a configured table association.
    */
  def deleteConfiguredTableAssociation(params: DeleteConfiguredTableAssociationInput): Request[DeleteConfiguredTableAssociationOutput, AWSError] = js.native
  def deleteConfiguredTableAssociation(
    params: DeleteConfiguredTableAssociationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfiguredTableAssociationOutput, Unit]
  ): Request[DeleteConfiguredTableAssociationOutput, AWSError] = js.native
  
  /**
    * Removes the specified member from a collaboration. The removed member is placed in the Removed status and can't interact with the collaboration. The removed member's data is inaccessible to active members of the collaboration.
    */
  def deleteMember(): Request[DeleteMemberOutput, AWSError] = js.native
  def deleteMember(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberOutput, Unit]): Request[DeleteMemberOutput, AWSError] = js.native
  /**
    * Removes the specified member from a collaboration. The removed member is placed in the Removed status and can't interact with the collaboration. The removed member's data is inaccessible to active members of the collaboration.
    */
  def deleteMember(params: DeleteMemberInput): Request[DeleteMemberOutput, AWSError] = js.native
  def deleteMember(
    params: DeleteMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberOutput, Unit]
  ): Request[DeleteMemberOutput, AWSError] = js.native
  
  /**
    * Deletes a specified membership. All resources under a membership must be deleted.
    */
  def deleteMembership(): Request[DeleteMembershipOutput, AWSError] = js.native
  def deleteMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembershipOutput, Unit]): Request[DeleteMembershipOutput, AWSError] = js.native
  /**
    * Deletes a specified membership. All resources under a membership must be deleted.
    */
  def deleteMembership(params: DeleteMembershipInput): Request[DeleteMembershipOutput, AWSError] = js.native
  def deleteMembership(
    params: DeleteMembershipInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembershipOutput, Unit]
  ): Request[DeleteMembershipOutput, AWSError] = js.native
  
  /**
    * Returns metadata about a collaboration.
    */
  def getCollaboration(): Request[GetCollaborationOutput, AWSError] = js.native
  def getCollaboration(callback: js.Function2[/* err */ AWSError, /* data */ GetCollaborationOutput, Unit]): Request[GetCollaborationOutput, AWSError] = js.native
  /**
    * Returns metadata about a collaboration.
    */
  def getCollaboration(params: GetCollaborationInput): Request[GetCollaborationOutput, AWSError] = js.native
  def getCollaboration(
    params: GetCollaborationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCollaborationOutput, Unit]
  ): Request[GetCollaborationOutput, AWSError] = js.native
  
  /**
    * Retrieves a configured table.
    */
  def getConfiguredTable(): Request[GetConfiguredTableOutput, AWSError] = js.native
  def getConfiguredTable(callback: js.Function2[/* err */ AWSError, /* data */ GetConfiguredTableOutput, Unit]): Request[GetConfiguredTableOutput, AWSError] = js.native
  /**
    * Retrieves a configured table.
    */
  def getConfiguredTable(params: GetConfiguredTableInput): Request[GetConfiguredTableOutput, AWSError] = js.native
  def getConfiguredTable(
    params: GetConfiguredTableInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfiguredTableOutput, Unit]
  ): Request[GetConfiguredTableOutput, AWSError] = js.native
  
  /**
    * Retrieves a configured table analysis rule.
    */
  def getConfiguredTableAnalysisRule(): Request[GetConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def getConfiguredTableAnalysisRule(callback: js.Function2[/* err */ AWSError, /* data */ GetConfiguredTableAnalysisRuleOutput, Unit]): Request[GetConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  /**
    * Retrieves a configured table analysis rule.
    */
  def getConfiguredTableAnalysisRule(params: GetConfiguredTableAnalysisRuleInput): Request[GetConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def getConfiguredTableAnalysisRule(
    params: GetConfiguredTableAnalysisRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[GetConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  
  /**
    * Retrieves a configured table association.
    */
  def getConfiguredTableAssociation(): Request[GetConfiguredTableAssociationOutput, AWSError] = js.native
  def getConfiguredTableAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetConfiguredTableAssociationOutput, Unit]): Request[GetConfiguredTableAssociationOutput, AWSError] = js.native
  /**
    * Retrieves a configured table association.
    */
  def getConfiguredTableAssociation(params: GetConfiguredTableAssociationInput): Request[GetConfiguredTableAssociationOutput, AWSError] = js.native
  def getConfiguredTableAssociation(
    params: GetConfiguredTableAssociationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfiguredTableAssociationOutput, Unit]
  ): Request[GetConfiguredTableAssociationOutput, AWSError] = js.native
  
  /**
    * Retrieves a specified membership for an identifier.
    */
  def getMembership(): Request[GetMembershipOutput, AWSError] = js.native
  def getMembership(callback: js.Function2[/* err */ AWSError, /* data */ GetMembershipOutput, Unit]): Request[GetMembershipOutput, AWSError] = js.native
  /**
    * Retrieves a specified membership for an identifier.
    */
  def getMembership(params: GetMembershipInput): Request[GetMembershipOutput, AWSError] = js.native
  def getMembership(
    params: GetMembershipInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMembershipOutput, Unit]
  ): Request[GetMembershipOutput, AWSError] = js.native
  
  /**
    * Returns query processing metadata.
    */
  def getProtectedQuery(): Request[GetProtectedQueryOutput, AWSError] = js.native
  def getProtectedQuery(callback: js.Function2[/* err */ AWSError, /* data */ GetProtectedQueryOutput, Unit]): Request[GetProtectedQueryOutput, AWSError] = js.native
  /**
    * Returns query processing metadata.
    */
  def getProtectedQuery(params: GetProtectedQueryInput): Request[GetProtectedQueryOutput, AWSError] = js.native
  def getProtectedQuery(
    params: GetProtectedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProtectedQueryOutput, Unit]
  ): Request[GetProtectedQueryOutput, AWSError] = js.native
  
  /**
    * Retrieves the schema for a relation within a collaboration.
    */
  def getSchema(): Request[GetSchemaOutput, AWSError] = js.native
  def getSchema(callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaOutput, Unit]): Request[GetSchemaOutput, AWSError] = js.native
  /**
    * Retrieves the schema for a relation within a collaboration.
    */
  def getSchema(params: GetSchemaInput): Request[GetSchemaOutput, AWSError] = js.native
  def getSchema(
    params: GetSchemaInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaOutput, Unit]
  ): Request[GetSchemaOutput, AWSError] = js.native
  
  /**
    * Retrieves a schema analysis rule.
    */
  def getSchemaAnalysisRule(): Request[GetSchemaAnalysisRuleOutput, AWSError] = js.native
  def getSchemaAnalysisRule(callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaAnalysisRuleOutput, Unit]): Request[GetSchemaAnalysisRuleOutput, AWSError] = js.native
  /**
    * Retrieves a schema analysis rule.
    */
  def getSchemaAnalysisRule(params: GetSchemaAnalysisRuleInput): Request[GetSchemaAnalysisRuleOutput, AWSError] = js.native
  def getSchemaAnalysisRule(
    params: GetSchemaAnalysisRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaAnalysisRuleOutput, Unit]
  ): Request[GetSchemaAnalysisRuleOutput, AWSError] = js.native
  
  /**
    * Lists collaborations the caller owns, is active in, or has been invited to.
    */
  def listCollaborations(): Request[ListCollaborationsOutput, AWSError] = js.native
  def listCollaborations(callback: js.Function2[/* err */ AWSError, /* data */ ListCollaborationsOutput, Unit]): Request[ListCollaborationsOutput, AWSError] = js.native
  /**
    * Lists collaborations the caller owns, is active in, or has been invited to.
    */
  def listCollaborations(params: ListCollaborationsInput): Request[ListCollaborationsOutput, AWSError] = js.native
  def listCollaborations(
    params: ListCollaborationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCollaborationsOutput, Unit]
  ): Request[ListCollaborationsOutput, AWSError] = js.native
  
  /**
    * Lists configured table associations for a membership.
    */
  def listConfiguredTableAssociations(): Request[ListConfiguredTableAssociationsOutput, AWSError] = js.native
  def listConfiguredTableAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListConfiguredTableAssociationsOutput, Unit]): Request[ListConfiguredTableAssociationsOutput, AWSError] = js.native
  /**
    * Lists configured table associations for a membership.
    */
  def listConfiguredTableAssociations(params: ListConfiguredTableAssociationsInput): Request[ListConfiguredTableAssociationsOutput, AWSError] = js.native
  def listConfiguredTableAssociations(
    params: ListConfiguredTableAssociationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfiguredTableAssociationsOutput, Unit]
  ): Request[ListConfiguredTableAssociationsOutput, AWSError] = js.native
  
  /**
    * Lists configured tables.
    */
  def listConfiguredTables(): Request[ListConfiguredTablesOutput, AWSError] = js.native
  def listConfiguredTables(callback: js.Function2[/* err */ AWSError, /* data */ ListConfiguredTablesOutput, Unit]): Request[ListConfiguredTablesOutput, AWSError] = js.native
  /**
    * Lists configured tables.
    */
  def listConfiguredTables(params: ListConfiguredTablesInput): Request[ListConfiguredTablesOutput, AWSError] = js.native
  def listConfiguredTables(
    params: ListConfiguredTablesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfiguredTablesOutput, Unit]
  ): Request[ListConfiguredTablesOutput, AWSError] = js.native
  
  /**
    * Lists all members within a collaboration.
    */
  def listMembers(): Request[ListMembersOutput, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersOutput, Unit]): Request[ListMembersOutput, AWSError] = js.native
  /**
    * Lists all members within a collaboration.
    */
  def listMembers(params: ListMembersInput): Request[ListMembersOutput, AWSError] = js.native
  def listMembers(
    params: ListMembersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersOutput, Unit]
  ): Request[ListMembersOutput, AWSError] = js.native
  
  /**
    * Lists all memberships resources within the caller's account.
    */
  def listMemberships(): Request[ListMembershipsOutput, AWSError] = js.native
  def listMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListMembershipsOutput, Unit]): Request[ListMembershipsOutput, AWSError] = js.native
  /**
    * Lists all memberships resources within the caller's account.
    */
  def listMemberships(params: ListMembershipsInput): Request[ListMembershipsOutput, AWSError] = js.native
  def listMemberships(
    params: ListMembershipsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembershipsOutput, Unit]
  ): Request[ListMembershipsOutput, AWSError] = js.native
  
  /**
    * Lists protected queries, sorted by the most recent query.
    */
  def listProtectedQueries(): Request[ListProtectedQueriesOutput, AWSError] = js.native
  def listProtectedQueries(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectedQueriesOutput, Unit]): Request[ListProtectedQueriesOutput, AWSError] = js.native
  /**
    * Lists protected queries, sorted by the most recent query.
    */
  def listProtectedQueries(params: ListProtectedQueriesInput): Request[ListProtectedQueriesOutput, AWSError] = js.native
  def listProtectedQueries(
    params: ListProtectedQueriesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectedQueriesOutput, Unit]
  ): Request[ListProtectedQueriesOutput, AWSError] = js.native
  
  /**
    * Lists the schemas for relations within a collaboration.
    */
  def listSchemas(): Request[ListSchemasOutput, AWSError] = js.native
  def listSchemas(callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasOutput, Unit]): Request[ListSchemasOutput, AWSError] = js.native
  /**
    * Lists the schemas for relations within a collaboration.
    */
  def listSchemas(params: ListSchemasInput): Request[ListSchemasOutput, AWSError] = js.native
  def listSchemas(
    params: ListSchemasInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasOutput, Unit]
  ): Request[ListSchemasOutput, AWSError] = js.native
  
  /**
    * Lists all of the tags that have been added to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists all of the tags that have been added to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Creates a protected query that is started by AWS Clean Rooms.
    */
  def startProtectedQuery(): Request[StartProtectedQueryOutput, AWSError] = js.native
  def startProtectedQuery(callback: js.Function2[/* err */ AWSError, /* data */ StartProtectedQueryOutput, Unit]): Request[StartProtectedQueryOutput, AWSError] = js.native
  /**
    * Creates a protected query that is started by AWS Clean Rooms.
    */
  def startProtectedQuery(params: StartProtectedQueryInput): Request[StartProtectedQueryOutput, AWSError] = js.native
  def startProtectedQuery(
    params: StartProtectedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartProtectedQueryOutput, Unit]
  ): Request[StartProtectedQueryOutput, AWSError] = js.native
  
  /**
    * Tags a resource.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Tags a resource.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes a tag or list of tags from a resource.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes a tag or list of tags from a resource.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates collaboration metadata and can only be called by the collaboration owner.
    */
  def updateCollaboration(): Request[UpdateCollaborationOutput, AWSError] = js.native
  def updateCollaboration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCollaborationOutput, Unit]): Request[UpdateCollaborationOutput, AWSError] = js.native
  /**
    * Updates collaboration metadata and can only be called by the collaboration owner.
    */
  def updateCollaboration(params: UpdateCollaborationInput): Request[UpdateCollaborationOutput, AWSError] = js.native
  def updateCollaboration(
    params: UpdateCollaborationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCollaborationOutput, Unit]
  ): Request[UpdateCollaborationOutput, AWSError] = js.native
  
  /**
    * Updates a configured table.
    */
  def updateConfiguredTable(): Request[UpdateConfiguredTableOutput, AWSError] = js.native
  def updateConfiguredTable(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfiguredTableOutput, Unit]): Request[UpdateConfiguredTableOutput, AWSError] = js.native
  /**
    * Updates a configured table.
    */
  def updateConfiguredTable(params: UpdateConfiguredTableInput): Request[UpdateConfiguredTableOutput, AWSError] = js.native
  def updateConfiguredTable(
    params: UpdateConfiguredTableInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfiguredTableOutput, Unit]
  ): Request[UpdateConfiguredTableOutput, AWSError] = js.native
  
  /**
    * Updates a configured table analysis rule.
    */
  def updateConfiguredTableAnalysisRule(): Request[UpdateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def updateConfiguredTableAnalysisRule(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[UpdateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  /**
    * Updates a configured table analysis rule.
    */
  def updateConfiguredTableAnalysisRule(params: UpdateConfiguredTableAnalysisRuleInput): Request[UpdateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  def updateConfiguredTableAnalysisRule(
    params: UpdateConfiguredTableAnalysisRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfiguredTableAnalysisRuleOutput, Unit]
  ): Request[UpdateConfiguredTableAnalysisRuleOutput, AWSError] = js.native
  
  /**
    * Updates a configured table association.
    */
  def updateConfiguredTableAssociation(): Request[UpdateConfiguredTableAssociationOutput, AWSError] = js.native
  def updateConfiguredTableAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfiguredTableAssociationOutput, Unit]
  ): Request[UpdateConfiguredTableAssociationOutput, AWSError] = js.native
  /**
    * Updates a configured table association.
    */
  def updateConfiguredTableAssociation(params: UpdateConfiguredTableAssociationInput): Request[UpdateConfiguredTableAssociationOutput, AWSError] = js.native
  def updateConfiguredTableAssociation(
    params: UpdateConfiguredTableAssociationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfiguredTableAssociationOutput, Unit]
  ): Request[UpdateConfiguredTableAssociationOutput, AWSError] = js.native
  
  /**
    * Updates a membership.
    */
  def updateMembership(): Request[UpdateMembershipOutput, AWSError] = js.native
  def updateMembership(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMembershipOutput, Unit]): Request[UpdateMembershipOutput, AWSError] = js.native
  /**
    * Updates a membership.
    */
  def updateMembership(params: UpdateMembershipInput): Request[UpdateMembershipOutput, AWSError] = js.native
  def updateMembership(
    params: UpdateMembershipInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMembershipOutput, Unit]
  ): Request[UpdateMembershipOutput, AWSError] = js.native
  
  /**
    * Updates the processing of a currently running query.
    */
  def updateProtectedQuery(): Request[UpdateProtectedQueryOutput, AWSError] = js.native
  def updateProtectedQuery(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProtectedQueryOutput, Unit]): Request[UpdateProtectedQueryOutput, AWSError] = js.native
  /**
    * Updates the processing of a currently running query.
    */
  def updateProtectedQuery(params: UpdateProtectedQueryInput): Request[UpdateProtectedQueryOutput, AWSError] = js.native
  def updateProtectedQuery(
    params: UpdateProtectedQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProtectedQueryOutput, Unit]
  ): Request[UpdateProtectedQueryOutput, AWSError] = js.native
}
