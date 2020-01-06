package typings.awsDashSdk.clientsOutpostsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outposts extends Service {
  @JSName("config")
  var config_Outposts: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Outpost.
    */
  def createOutpost(): Request[CreateOutpostOutput, AWSError] = js.native
  def createOutpost(callback: js.Function2[/* err */ AWSError, /* data */ CreateOutpostOutput, Unit]): Request[CreateOutpostOutput, AWSError] = js.native
  /**
    * Creates an Outpost.
    */
  def createOutpost(params: CreateOutpostInput): Request[CreateOutpostOutput, AWSError] = js.native
  def createOutpost(
    params: CreateOutpostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOutpostOutput, Unit]
  ): Request[CreateOutpostOutput, AWSError] = js.native
  /**
    * Gets information about the specified Outpost.
    */
  def getOutpost(): Request[GetOutpostOutput, AWSError] = js.native
  def getOutpost(callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostOutput, Unit]): Request[GetOutpostOutput, AWSError] = js.native
  /**
    * Gets information about the specified Outpost.
    */
  def getOutpost(params: GetOutpostInput): Request[GetOutpostOutput, AWSError] = js.native
  def getOutpost(
    params: GetOutpostInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostOutput, Unit]
  ): Request[GetOutpostOutput, AWSError] = js.native
  /**
    * Lists the instance types for the specified Outpost.
    */
  def getOutpostInstanceTypes(): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  def getOutpostInstanceTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostInstanceTypesOutput, Unit]): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  /**
    * Lists the instance types for the specified Outpost.
    */
  def getOutpostInstanceTypes(params: GetOutpostInstanceTypesInput): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  def getOutpostInstanceTypes(
    params: GetOutpostInstanceTypesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOutpostInstanceTypesOutput, Unit]
  ): Request[GetOutpostInstanceTypesOutput, AWSError] = js.native
  /**
    * List the Outposts for your AWS account.
    */
  def listOutposts(): Request[ListOutpostsOutput, AWSError] = js.native
  def listOutposts(callback: js.Function2[/* err */ AWSError, /* data */ ListOutpostsOutput, Unit]): Request[ListOutpostsOutput, AWSError] = js.native
  /**
    * List the Outposts for your AWS account.
    */
  def listOutposts(params: ListOutpostsInput): Request[ListOutpostsOutput, AWSError] = js.native
  def listOutposts(
    params: ListOutpostsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOutpostsOutput, Unit]
  ): Request[ListOutpostsOutput, AWSError] = js.native
  /**
    * Lists the sites for the specified AWS account.
    */
  def listSites(): Request[ListSitesOutput, AWSError] = js.native
  def listSites(callback: js.Function2[/* err */ AWSError, /* data */ ListSitesOutput, Unit]): Request[ListSitesOutput, AWSError] = js.native
  /**
    * Lists the sites for the specified AWS account.
    */
  def listSites(params: ListSitesInput): Request[ListSitesOutput, AWSError] = js.native
  def listSites(
    params: ListSitesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSitesOutput, Unit]
  ): Request[ListSitesOutput, AWSError] = js.native
}

