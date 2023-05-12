package typings.awsSdk.clientsAccountMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends Service {
  
  @JSName("config")
  var config_Account: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the specified alternate contact from an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
    */
  def deleteAlternateContact(): Request[js.Object, AWSError] = js.native
  def deleteAlternateContact(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified alternate contact from an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
    */
  def deleteAlternateContact(params: DeleteAlternateContactRequest): Request[js.Object, AWSError] = js.native
  def deleteAlternateContact(
    params: DeleteAlternateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disables (opts-out) a particular Region for an account.
    */
  def disableRegion(): Request[js.Object, AWSError] = js.native
  def disableRegion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables (opts-out) a particular Region for an account.
    */
  def disableRegion(params: DisableRegionRequest): Request[js.Object, AWSError] = js.native
  def disableRegion(
    params: DisableRegionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables (opts-in) a particular Region for an account.
    */
  def enableRegion(): Request[js.Object, AWSError] = js.native
  def enableRegion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables (opts-in) a particular Region for an account.
    */
  def enableRegion(params: EnableRegionRequest): Request[js.Object, AWSError] = js.native
  def enableRegion(
    params: EnableRegionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
    */
  def getAlternateContact(): Request[GetAlternateContactResponse, AWSError] = js.native
  def getAlternateContact(callback: js.Function2[/* err */ AWSError, /* data */ GetAlternateContactResponse, Unit]): Request[GetAlternateContactResponse, AWSError] = js.native
  /**
    * Retrieves the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
    */
  def getAlternateContact(params: GetAlternateContactRequest): Request[GetAlternateContactResponse, AWSError] = js.native
  def getAlternateContact(
    params: GetAlternateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAlternateContactResponse, Unit]
  ): Request[GetAlternateContactResponse, AWSError] = js.native
  
  /**
    * Retrieves the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
    */
  def getContactInformation(): Request[GetContactInformationResponse, AWSError] = js.native
  def getContactInformation(callback: js.Function2[/* err */ AWSError, /* data */ GetContactInformationResponse, Unit]): Request[GetContactInformationResponse, AWSError] = js.native
  /**
    * Retrieves the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
    */
  def getContactInformation(params: GetContactInformationRequest): Request[GetContactInformationResponse, AWSError] = js.native
  def getContactInformation(
    params: GetContactInformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactInformationResponse, Unit]
  ): Request[GetContactInformationResponse, AWSError] = js.native
  
  /**
    * Retrieves the opt-in status of a particular Region.
    */
  def getRegionOptStatus(): Request[GetRegionOptStatusResponse, AWSError] = js.native
  def getRegionOptStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetRegionOptStatusResponse, Unit]): Request[GetRegionOptStatusResponse, AWSError] = js.native
  /**
    * Retrieves the opt-in status of a particular Region.
    */
  def getRegionOptStatus(params: GetRegionOptStatusRequest): Request[GetRegionOptStatusResponse, AWSError] = js.native
  def getRegionOptStatus(
    params: GetRegionOptStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegionOptStatusResponse, Unit]
  ): Request[GetRegionOptStatusResponse, AWSError] = js.native
  
  /**
    * Lists all the Regions for a given account and their respective opt-in statuses. Optionally, this list can be filtered by the region-opt-status-contains parameter. 
    */
  def listRegions(): Request[ListRegionsResponse, AWSError] = js.native
  def listRegions(callback: js.Function2[/* err */ AWSError, /* data */ ListRegionsResponse, Unit]): Request[ListRegionsResponse, AWSError] = js.native
  /**
    * Lists all the Regions for a given account and their respective opt-in statuses. Optionally, this list can be filtered by the region-opt-status-contains parameter. 
    */
  def listRegions(params: ListRegionsRequest): Request[ListRegionsResponse, AWSError] = js.native
  def listRegions(
    params: ListRegionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegionsResponse, Unit]
  ): Request[ListRegionsResponse, AWSError] = js.native
  
  /**
    * Modifies the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
    */
  def putAlternateContact(): Request[js.Object, AWSError] = js.native
  def putAlternateContact(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the specified alternate contact attached to an Amazon Web Services account. For complete details about how to use the alternate contact operations, see Access or updating the alternate contacts.  Before you can update the alternate contact information for an Amazon Web Services account that is managed by Organizations, you must first enable integration between Amazon Web Services Account Management and Organizations. For more information, see Enabling trusted access for Amazon Web Services Account Management. 
    */
  def putAlternateContact(params: PutAlternateContactRequest): Request[js.Object, AWSError] = js.native
  def putAlternateContact(
    params: PutAlternateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
    */
  def putContactInformation(): Request[js.Object, AWSError] = js.native
  def putContactInformation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the primary contact information of an Amazon Web Services account. For complete details about how to use the primary contact operations, see Update the primary and alternate contact information.
    */
  def putContactInformation(params: PutContactInformationRequest): Request[js.Object, AWSError] = js.native
  def putContactInformation(
    params: PutContactInformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
