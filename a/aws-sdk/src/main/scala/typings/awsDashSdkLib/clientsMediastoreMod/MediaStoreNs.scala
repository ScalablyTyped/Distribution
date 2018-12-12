package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mediastore", "MediaStore")
@js.native
object MediaStoreNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Container extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the container. The ARN has the following format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;  For example: arn:aws:mediastore:us-west-2:111122223333:container/movies 
         */
    var ARN: js.UndefOr[ContainerARN] = js.undefined
    /**
         * Unix timestamp.
         */
    var CreationTime: js.UndefOr[TimeStamp] = js.undefined
    /**
         * The DNS endpoint of the container. Use the endpoint to identify the specific container when sending requests to the data plane. The service assigns this value when the container is created. Once the value has been assigned, it does not change.
         */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
    /**
         * The name of the container.
         */
    var Name: js.UndefOr[ContainerName] = js.undefined
    /**
         * The status of container creation or deletion. The status is one of the following: CREATING, ACTIVE, or DELETING. While the service is creating the container, the status is CREATING. When the endpoint is available, the status changes to ACTIVE.
         */
    var Status: js.UndefOr[ContainerStatus] = js.undefined
  }
  
  
  trait CorsRule extends js.Object {
    /**
         * Specifies which headers are allowed in a preflight OPTIONS request through the Access-Control-Request-Headers header. Each header name that is specified in Access-Control-Request-Headers must have a corresponding entry in the rule. Only the headers that were requested are sent back.  This element can contain only one wildcard character (*).
         */
    var AllowedHeaders: AllowedHeaders
    /**
         * Identifies an HTTP method that the origin that is specified in the rule is allowed to execute. Each CORS rule must contain at least one AllowedMethods and one AllowedOrigins element.
         */
    var AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined
    /**
         * One or more response headers that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). Each CORS rule must have at least one AllowedOrigins element. The string value can include only one wildcard character (*), for example, http:// *.example.com. Additionally, you can specify only one wildcard character to allow cross-origin access for all origins.
         */
    var AllowedOrigins: AllowedOrigins
    /**
         * One or more headers in the response that you want users to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object). This element is optional for each rule.
         */
    var ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined
    /**
         * The time in seconds that your browser caches the preflight response for the specified resource. A CORS rule can have only one MaxAgeSeconds element.
         */
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
  }
  
  
  trait CreateContainerInput extends js.Object {
    /**
         * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS account within a specific region. As an example, you could create a container named movies in every region, as long as you don’t have an existing container with that name.
         */
    var ContainerName: ContainerName
  }
  
  
  trait CreateContainerOutput extends js.Object {
    /**
         * ContainerARN: The Amazon Resource Name (ARN) of the newly created container. The ARN has the following format: arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;. For example: arn:aws:mediastore:us-west-2:111122223333:container/movies  ContainerName: The container name as specified in the request. CreationTime: Unix time stamp. Status: The status of container creation or deletion. The status is one of the following: CREATING, ACTIVE, or DELETING. While the service is creating the container, the status is CREATING. When an endpoint is available, the status changes to ACTIVE. The return value does not include the container's endpoint. To make downstream requests, you must obtain this value by using DescribeContainer or ListContainers.
         */
    var Container: Container
  }
  
  
  trait DeleteContainerInput extends js.Object {
    /**
         * The name of the container to delete. 
         */
    var ContainerName: ContainerName
  }
  
  
  trait DeleteContainerOutput extends js.Object
  
  
  trait DeleteContainerPolicyInput extends js.Object {
    /**
         * The name of the container that holds the policy.
         */
    var ContainerName: ContainerName
  }
  
  
  trait DeleteContainerPolicyOutput extends js.Object
  
  
  trait DeleteCorsPolicyInput extends js.Object {
    /**
         * The name of the container to remove the policy from.
         */
    var ContainerName: ContainerName
  }
  
  
  trait DeleteCorsPolicyOutput extends js.Object
  
  
  trait DeleteLifecyclePolicyInput extends js.Object {
    /**
         * The name of the container that holds the object lifecycle policy.
         */
    var ContainerName: ContainerName
  }
  
  
  trait DeleteLifecyclePolicyOutput extends js.Object
  
  
  trait DescribeContainerInput extends js.Object {
    /**
         * The name of the container to query.
         */
    var ContainerName: js.UndefOr[ContainerName] = js.undefined
  }
  
  
  trait DescribeContainerOutput extends js.Object {
    /**
         * The name of the queried container.
         */
    var Container: js.UndefOr[Container] = js.undefined
  }
  
  
  trait GetContainerPolicyInput extends js.Object {
    /**
         * The name of the container. 
         */
    var ContainerName: ContainerName
  }
  
  
  trait GetContainerPolicyOutput extends js.Object {
    /**
         * The contents of the access policy.
         */
    var Policy: ContainerPolicy
  }
  
  
  trait GetCorsPolicyInput extends js.Object {
    /**
         * The name of the container that the policy is assigned to.
         */
    var ContainerName: ContainerName
  }
  
  
  trait GetCorsPolicyOutput extends js.Object {
    /**
         * The CORS policy assigned to the container.
         */
    var CorsPolicy: CorsPolicy
  }
  
  
  trait GetLifecyclePolicyInput extends js.Object {
    /**
         * The name of the container that the object lifecycle policy is assigned to.
         */
    var ContainerName: ContainerName
  }
  
  
  trait GetLifecyclePolicyOutput extends js.Object {
    /**
         * The object lifecycle policy that is assigned to the container.
         */
    var LifecyclePolicy: LifecyclePolicy
  }
  
  
  trait ListContainersInput extends js.Object {
    /**
         * Enter the maximum number of containers in the response. Use from 1 to 255 characters. 
         */
    var MaxResults: js.UndefOr[ContainerListLimit] = js.undefined
    /**
         * Only if you used MaxResults in the first command, enter the token (which was included in the previous response) to obtain the next set of containers. This token is included in a response only if there actually are more containers to list.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListContainersOutput extends js.Object {
    /**
         * The names of the containers.
         */
    var Containers: ContainerList
    /**
         *  NextToken is the token to use in the next call to ListContainers. This token is returned only if you included the MaxResults tag in the original command, and only if there are still containers to return. 
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait PutContainerPolicyInput extends js.Object {
    /**
         * The name of the container.
         */
    var ContainerName: ContainerName
    /**
         * The contents of the policy, which includes the following:    One Version tag   One Statement tag that contains the standard tags for the policy.  
         */
    var Policy: ContainerPolicy
  }
  
  
  trait PutContainerPolicyOutput extends js.Object
  
  
  trait PutCorsPolicyInput extends js.Object {
    /**
         * The name of the container that you want to assign the CORS policy to.
         */
    var ContainerName: ContainerName
    /**
         * The CORS policy to apply to the container. 
         */
    var CorsPolicy: CorsPolicy
  }
  
  
  trait PutCorsPolicyOutput extends js.Object
  
  
  trait PutLifecyclePolicyInput extends js.Object {
    /**
         * The name of the container that you want to assign the object lifecycle policy to.
         */
    var ContainerName: ContainerName
    /**
         * The object lifecycle policy to apply to the container.
         */
    var LifecyclePolicy: LifecyclePolicy
  }
  
  
  trait PutLifecyclePolicyOutput extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
       */
    def createContainer(): awsDashSdkLib.libRequestMod.Request[CreateContainerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
       */
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
    /**
       * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
       */
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
    /**
       * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
       */
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
    /**
       * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
       */
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
    /**
       * Deletes the access policy that is associated with the specified container.
       */
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
    /**
       * Deletes the access policy that is associated with the specified container.
       */
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
    /**
       * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
       */
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
    /**
       * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
       */
    def deleteCorsPolicy(
      params: DeleteCorsPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCorsPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an object lifecycle policy from a container.
       */
    def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an object lifecycle policy from a container.
       */
    def deleteLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLifecyclePolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an object lifecycle policy from a container.
       */
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes an object lifecycle policy from a container.
       */
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
    /**
       * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
       */
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
    /**
       * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
       */
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
    /**
       * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
       */
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
    /**
       * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
       */
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
    /**
       * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
       */
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
    /**
       * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
       */
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
    /**
       * Retrieves the object lifecycle policy that is assigned to a container.
       */
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
    /**
       * Retrieves the object lifecycle policy that is assigned to a container.
       */
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
    /**
       * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
       */
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
    /**
       * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
       */
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
    /**
       * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
       */
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
    /**
       * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
       */
    def putContainerPolicy(
      params: PutContainerPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutContainerPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutContainerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
       */
    def putCorsPolicy(): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
       */
    def putCorsPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutCorsPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
       */
    def putCorsPolicy(params: PutCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
       */
    def putCorsPolicy(
      params: PutCorsPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutCorsPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutCorsPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. 
       */
    def putLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. 
       */
    def putLifecyclePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecyclePolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. 
       */
    def putLifecyclePolicy(params: PutLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. 
       */
    def putLifecyclePolicy(
      params: PutLifecyclePolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLifecyclePolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLifecyclePolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AllowedHeaders = js.Array[Header]
  type AllowedMethods = js.Array[MethodName]
  type AllowedOrigins = js.Array[Origin]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContainerARN = java.lang.String
  type ContainerList = js.Array[Container]
  type ContainerListLimit = scala.Double
  type ContainerName = java.lang.String
  type ContainerPolicy = java.lang.String
  type ContainerStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type CorsPolicy = js.Array[CorsRule]
  type Endpoint = java.lang.String
  type ExposeHeaders = js.Array[Header]
  type Header = java.lang.String
  type LifecyclePolicy = java.lang.String
  type MaxAgeSeconds = scala.Double
  type MethodName = awsDashSdkLib.awsDashSdkLibStrings.PUT | awsDashSdkLib.awsDashSdkLibStrings.GET | awsDashSdkLib.awsDashSdkLibStrings.DELETE | awsDashSdkLib.awsDashSdkLibStrings.HEAD | java.lang.String
  type Origin = java.lang.String
  type PaginationToken = java.lang.String
  type TimeStamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-09-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

