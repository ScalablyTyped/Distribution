package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStore
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaStore: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
    */
  def createContainer(): awsDashSdkLib.libRequestMod.Request[CreateContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createContainer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
    */
  def createContainer(params: CreateContainerInput): awsDashSdkLib.libRequestMod.Request[CreateContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createContainer(
    params: CreateContainerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
    */
  def deleteContainer(): awsDashSdkLib.libRequestMod.Request[DeleteContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteContainer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
    */
  def deleteContainer(params: DeleteContainerInput): awsDashSdkLib.libRequestMod.Request[DeleteContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteContainer(
    params: DeleteContainerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the access policy that is associated with the specified container.
    */
  def deleteContainerPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteContainerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the access policy that is associated with the specified container.
    */
  def deleteContainerPolicy(params: DeleteContainerPolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteContainerPolicy(
    params: DeleteContainerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
    */
  def deleteCorsPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCorsPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
    */
  def deleteCorsPolicy(params: DeleteCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCorsPolicy(
    params: DeleteCorsPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
    */
  def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
    */
  def deleteLifecyclePolicy(params: DeleteLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLifecyclePolicy(
    params: DeleteLifecyclePolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
    */
  def describeContainer(): awsDashSdkLib.libRequestMod.Request[DescribeContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeContainer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
    */
  def describeContainer(params: DescribeContainerInput): awsDashSdkLib.libRequestMod.Request[DescribeContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeContainer(
    params: DescribeContainerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
    */
  def getContainerPolicy(): awsDashSdkLib.libRequestMod.Request[GetContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getContainerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
    */
  def getContainerPolicy(params: GetContainerPolicyInput): awsDashSdkLib.libRequestMod.Request[GetContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getContainerPolicy(
    params: GetContainerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
    */
  def getCorsPolicy(): awsDashSdkLib.libRequestMod.Request[GetCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCorsPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
    */
  def getCorsPolicy(params: GetCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[GetCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCorsPolicy(
    params: GetCorsPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the object lifecycle policy that is assigned to a container.
    */
  def getLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the object lifecycle policy that is assigned to a container.
    */
  def getLifecyclePolicy(params: GetLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLifecyclePolicy(
    params: GetLifecyclePolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
    */
  def listContainers(): awsDashSdkLib.libRequestMod.Request[ListContainersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listContainers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListContainersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListContainersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
    */
  def listContainers(params: ListContainersInput): awsDashSdkLib.libRequestMod.Request[ListContainersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listContainers(
    params: ListContainersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListContainersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListContainersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
    */
  def putContainerPolicy(): awsDashSdkLib.libRequestMod.Request[PutContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putContainerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
    */
  def putContainerPolicy(params: PutContainerPolicyInput): awsDashSdkLib.libRequestMod.Request[PutContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putContainerPolicy(
    params: PutContainerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed. To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore.
    */
  def putCorsPolicy(): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putCorsPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed. To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore.
    */
  def putCorsPolicy(params: PutCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putCorsPolicy(
    params: PutCorsPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take effect. For information about how to construct an object lifecycle policy, see Components of an Object Lifecycle Policy.
    */
  def putLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take effect. For information about how to construct an object lifecycle policy, see Components of an Object Lifecycle Policy.
    */
  def putLifecyclePolicy(params: PutLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLifecyclePolicy(
    params: PutLifecyclePolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts access logging on the specified container. When you enable access logging on a container, MediaStore delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
    */
  def startAccessLogging(): awsDashSdkLib.libRequestMod.Request[StartAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAccessLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts access logging on the specified container. When you enable access logging on a container, MediaStore delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
    */
  def startAccessLogging(params: StartAccessLoggingInput): awsDashSdkLib.libRequestMod.Request[StartAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAccessLogging(
    params: StartAccessLoggingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
    */
  def stopAccessLogging(): awsDashSdkLib.libRequestMod.Request[StopAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopAccessLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
    */
  def stopAccessLogging(params: StopAccessLoggingInput): awsDashSdkLib.libRequestMod.Request[StopAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopAccessLogging(
    params: StopAccessLoggingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopAccessLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

