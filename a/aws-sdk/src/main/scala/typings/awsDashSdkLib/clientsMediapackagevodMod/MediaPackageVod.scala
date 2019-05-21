package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPackageVod
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaPackageVod: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new MediaPackage VOD Asset resource.
    */
  def createAsset(): awsDashSdkLib.libRequestMod.Request[CreateAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAsset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAssetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD Asset resource.
    */
  def createAsset(params: CreateAssetRequest): awsDashSdkLib.libRequestMod.Request[CreateAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAsset(
    params: CreateAssetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAssetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD PackagingConfiguration resource.
    */
  def createPackagingConfiguration(): awsDashSdkLib.libRequestMod.Request[CreatePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPackagingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePackagingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD PackagingConfiguration resource.
    */
  def createPackagingConfiguration(params: CreatePackagingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreatePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPackagingConfiguration(
    params: CreatePackagingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePackagingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD PackagingGroup resource.
    */
  def createPackagingGroup(): awsDashSdkLib.libRequestMod.Request[CreatePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPackagingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePackagingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new MediaPackage VOD PackagingGroup resource.
    */
  def createPackagingGroup(params: CreatePackagingGroupRequest): awsDashSdkLib.libRequestMod.Request[CreatePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPackagingGroup(
    params: CreatePackagingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePackagingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing MediaPackage VOD Asset resource.
    */
  def deleteAsset(): awsDashSdkLib.libRequestMod.Request[DeleteAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAsset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAssetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing MediaPackage VOD Asset resource.
    */
  def deleteAsset(params: DeleteAssetRequest): awsDashSdkLib.libRequestMod.Request[DeleteAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAsset(
    params: DeleteAssetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAssetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a MediaPackage VOD PackagingConfiguration resource.
    */
  def deletePackagingConfiguration(): awsDashSdkLib.libRequestMod.Request[DeletePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePackagingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePackagingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a MediaPackage VOD PackagingConfiguration resource.
    */
  def deletePackagingConfiguration(params: DeletePackagingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeletePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePackagingConfiguration(
    params: DeletePackagingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePackagingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a MediaPackage VOD PackagingGroup resource.
    */
  def deletePackagingGroup(): awsDashSdkLib.libRequestMod.Request[DeletePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePackagingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePackagingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a MediaPackage VOD PackagingGroup resource.
    */
  def deletePackagingGroup(params: DeletePackagingGroupRequest): awsDashSdkLib.libRequestMod.Request[DeletePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePackagingGroup(
    params: DeletePackagingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePackagingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD Asset resource.
    */
  def describeAsset(): awsDashSdkLib.libRequestMod.Request[DescribeAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAsset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD Asset resource.
    */
  def describeAsset(params: DescribeAssetRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAsset(
    params: DescribeAssetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
    */
  def describePackagingConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePackagingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePackagingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD PackagingConfiguration resource.
    */
  def describePackagingConfiguration(params: DescribePackagingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePackagingConfiguration(
    params: DescribePackagingConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePackagingConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePackagingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD PackagingGroup resource.
    */
  def describePackagingGroup(): awsDashSdkLib.libRequestMod.Request[DescribePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePackagingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePackagingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a description of a MediaPackage VOD PackagingGroup resource.
    */
  def describePackagingGroup(params: DescribePackagingGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePackagingGroup(
    params: DescribePackagingGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePackagingGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePackagingGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD Asset resources.
    */
  def listAssets(): awsDashSdkLib.libRequestMod.Request[ListAssetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD Asset resources.
    */
  def listAssets(params: ListAssetsRequest): awsDashSdkLib.libRequestMod.Request[ListAssetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssets(
    params: ListAssetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
    */
  def listPackagingConfigurations(): awsDashSdkLib.libRequestMod.Request[ListPackagingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPackagingConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPackagingConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPackagingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD PackagingConfiguration resources.
    */
  def listPackagingConfigurations(params: ListPackagingConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListPackagingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPackagingConfigurations(
    params: ListPackagingConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPackagingConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPackagingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD PackagingGroup resources.
    */
  def listPackagingGroups(): awsDashSdkLib.libRequestMod.Request[ListPackagingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPackagingGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPackagingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPackagingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a collection of MediaPackage VOD PackagingGroup resources.
    */
  def listPackagingGroups(params: ListPackagingGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListPackagingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPackagingGroups(
    params: ListPackagingGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPackagingGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPackagingGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

