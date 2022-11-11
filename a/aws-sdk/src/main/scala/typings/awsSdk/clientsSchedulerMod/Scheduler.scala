package typings.awsSdk.clientsSchedulerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduler extends Service {
  
  @JSName("config")
  var config_Scheduler: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates the specified schedule.
    */
  def createSchedule(): Request[CreateScheduleOutput, AWSError] = js.native
  def createSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleOutput, Unit]): Request[CreateScheduleOutput, AWSError] = js.native
  /**
    * Creates the specified schedule.
    */
  def createSchedule(params: CreateScheduleInput): Request[CreateScheduleOutput, AWSError] = js.native
  def createSchedule(
    params: CreateScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleOutput, Unit]
  ): Request[CreateScheduleOutput, AWSError] = js.native
  
  /**
    * Creates the specified schedule group.
    */
  def createScheduleGroup(): Request[CreateScheduleGroupOutput, AWSError] = js.native
  def createScheduleGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleGroupOutput, Unit]): Request[CreateScheduleGroupOutput, AWSError] = js.native
  /**
    * Creates the specified schedule group.
    */
  def createScheduleGroup(params: CreateScheduleGroupInput): Request[CreateScheduleGroupOutput, AWSError] = js.native
  def createScheduleGroup(
    params: CreateScheduleGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleGroupOutput, Unit]
  ): Request[CreateScheduleGroupOutput, AWSError] = js.native
  
  /**
    * Deletes the specified schedule.
    */
  def deleteSchedule(): Request[DeleteScheduleOutput, AWSError] = js.native
  def deleteSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleOutput, Unit]): Request[DeleteScheduleOutput, AWSError] = js.native
  /**
    * Deletes the specified schedule.
    */
  def deleteSchedule(params: DeleteScheduleInput): Request[DeleteScheduleOutput, AWSError] = js.native
  def deleteSchedule(
    params: DeleteScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleOutput, Unit]
  ): Request[DeleteScheduleOutput, AWSError] = js.native
  
  /**
    * Deletes the specified schedule group. Deleting a schedule group results in EventBridge Scheduler deleting all schedules associated with the group. When you delete a group, it remains in a DELETING state until all of its associated schedules are deleted. Schedules associated with the group that are set to run while the schedule group is in the process of being deleted might continue to invoke their targets until the schedule group and its associated schedules are deleted.   This operation is eventually consistent.  
    */
  def deleteScheduleGroup(): Request[DeleteScheduleGroupOutput, AWSError] = js.native
  def deleteScheduleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleGroupOutput, Unit]): Request[DeleteScheduleGroupOutput, AWSError] = js.native
  /**
    * Deletes the specified schedule group. Deleting a schedule group results in EventBridge Scheduler deleting all schedules associated with the group. When you delete a group, it remains in a DELETING state until all of its associated schedules are deleted. Schedules associated with the group that are set to run while the schedule group is in the process of being deleted might continue to invoke their targets until the schedule group and its associated schedules are deleted.   This operation is eventually consistent.  
    */
  def deleteScheduleGroup(params: DeleteScheduleGroupInput): Request[DeleteScheduleGroupOutput, AWSError] = js.native
  def deleteScheduleGroup(
    params: DeleteScheduleGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleGroupOutput, Unit]
  ): Request[DeleteScheduleGroupOutput, AWSError] = js.native
  
  /**
    * Retrieves the specified schedule.
    */
  def getSchedule(): Request[GetScheduleOutput, AWSError] = js.native
  def getSchedule(callback: js.Function2[/* err */ AWSError, /* data */ GetScheduleOutput, Unit]): Request[GetScheduleOutput, AWSError] = js.native
  /**
    * Retrieves the specified schedule.
    */
  def getSchedule(params: GetScheduleInput): Request[GetScheduleOutput, AWSError] = js.native
  def getSchedule(
    params: GetScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetScheduleOutput, Unit]
  ): Request[GetScheduleOutput, AWSError] = js.native
  
  /**
    * Retrieves the specified schedule group.
    */
  def getScheduleGroup(): Request[GetScheduleGroupOutput, AWSError] = js.native
  def getScheduleGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetScheduleGroupOutput, Unit]): Request[GetScheduleGroupOutput, AWSError] = js.native
  /**
    * Retrieves the specified schedule group.
    */
  def getScheduleGroup(params: GetScheduleGroupInput): Request[GetScheduleGroupOutput, AWSError] = js.native
  def getScheduleGroup(
    params: GetScheduleGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetScheduleGroupOutput, Unit]
  ): Request[GetScheduleGroupOutput, AWSError] = js.native
  
  /**
    * Returns a paginated list of your schedule groups.
    */
  def listScheduleGroups(): Request[ListScheduleGroupsOutput, AWSError] = js.native
  def listScheduleGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListScheduleGroupsOutput, Unit]): Request[ListScheduleGroupsOutput, AWSError] = js.native
  /**
    * Returns a paginated list of your schedule groups.
    */
  def listScheduleGroups(params: ListScheduleGroupsInput): Request[ListScheduleGroupsOutput, AWSError] = js.native
  def listScheduleGroups(
    params: ListScheduleGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListScheduleGroupsOutput, Unit]
  ): Request[ListScheduleGroupsOutput, AWSError] = js.native
  
  /**
    * Returns a paginated list of your EventBridge Scheduler schedules.
    */
  def listSchedules(): Request[ListSchedulesOutput, AWSError] = js.native
  def listSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulesOutput, Unit]): Request[ListSchedulesOutput, AWSError] = js.native
  /**
    * Returns a paginated list of your EventBridge Scheduler schedules.
    */
  def listSchedules(params: ListSchedulesInput): Request[ListSchedulesOutput, AWSError] = js.native
  def listSchedules(
    params: ListSchedulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulesOutput, Unit]
  ): Request[ListSchedulesOutput, AWSError] = js.native
  
  /**
    * Lists the tags associated with the Scheduler resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags associated with the Scheduler resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified EventBridge Scheduler resource. You can only assign tags to schedule groups.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified EventBridge Scheduler resource. You can only assign tags to schedule groups.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes one or more tags from the specified EventBridge Scheduler schedule group.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tags from the specified EventBridge Scheduler schedule group.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    *  Updates the specified schedule. When you call UpdateSchedule, EventBridge Scheduler uses all values, including empty values, specified in the request and overrides the existing schedule. This is by design. This means that if you do not set an optional field in your request, that field will be set to its system-default value after the update.   Before calling this operation, we recommend that you call the GetSchedule API operation and make a note of all optional parameters for your UpdateSchedule call. 
    */
  def updateSchedule(): Request[UpdateScheduleOutput, AWSError] = js.native
  def updateSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduleOutput, Unit]): Request[UpdateScheduleOutput, AWSError] = js.native
  /**
    *  Updates the specified schedule. When you call UpdateSchedule, EventBridge Scheduler uses all values, including empty values, specified in the request and overrides the existing schedule. This is by design. This means that if you do not set an optional field in your request, that field will be set to its system-default value after the update.   Before calling this operation, we recommend that you call the GetSchedule API operation and make a note of all optional parameters for your UpdateSchedule call. 
    */
  def updateSchedule(params: UpdateScheduleInput): Request[UpdateScheduleOutput, AWSError] = js.native
  def updateSchedule(
    params: UpdateScheduleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduleOutput, Unit]
  ): Request[UpdateScheduleOutput, AWSError] = js.native
}
