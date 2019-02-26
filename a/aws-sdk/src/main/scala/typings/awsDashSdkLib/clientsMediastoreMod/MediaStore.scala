package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStore
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaStore: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ClientConfiguration = js.native
  /**
    * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
    */
  def createContainer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createContainer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
    */
  def createContainer(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createContainer(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.CreateContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
    */
  def deleteContainer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteContainer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified container. Before you make a DeleteContainer request, delete any objects in the container or in any folders in the container. You can delete only empty containers. 
    */
  def deleteContainer(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteContainer(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the access policy that is associated with the specified container.
    */
  def deleteContainerPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteContainerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the access policy that is associated with the specified container.
    */
  def deleteContainerPolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteContainerPolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
    */
  def deleteCorsPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCorsPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:DeleteCorsPolicy action. The container owner has this permission by default and can grant this permission to others.
    */
  def deleteCorsPolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCorsPolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
    */
  def deleteLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
    */
  def deleteLifecyclePolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLifecyclePolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DeleteLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
    */
  def describeContainer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeContainer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint does not change after it has been assigned. The DescribeContainer request returns a single Container object based on ContainerName. To return all Container objects that are associated with a specified AWS account, use ListContainers.
    */
  def describeContainer(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeContainer(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.DescribeContainerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
    */
  def getContainerPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getContainerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the access policy for the specified container. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide.
    */
  def getContainerPolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getContainerPolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
    */
  def getCorsPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCorsPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container. To use this operation, you must have permission to perform the MediaStore:GetCorsPolicy action. By default, the container owner has this permission and can grant it to others.
    */
  def getCorsPolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCorsPolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the object lifecycle policy that is assigned to a container.
    */
  def getLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the object lifecycle policy that is assigned to a container.
    */
  def getLifecyclePolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLifecyclePolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.GetLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
    */
  def listContainers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listContainers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the properties of all containers in AWS Elemental MediaStore.  You can query to receive all the containers in one response. Or you can include the MaxResults parameter to receive a limited number of containers in each response. In this case, the response includes a token. To get the next set of containers, send the command again, this time with the NextToken parameter (with the returned token as its value). The next set of responses appears, with a token if there are still more containers to receive.  See also DescribeContainer, which gets the properties of one container. 
    */
  def listContainers(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listContainers(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.ListContainersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
    */
  def putContainerPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putContainerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an access policy for the specified container to restrict the users and clients that can access it. For information about the data that is included in an access policy, see the AWS Identity and Access Management User Guide. For this release of the REST API, you can create only one policy for a container. If you enter PutContainerPolicy twice, the second command modifies the existing policy. 
    */
  def putContainerPolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putContainerPolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutContainerPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed. To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore.
    */
  def putCorsPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putCorsPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest capability. To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed. To learn more about CORS, see Cross-Origin Resource Sharing (CORS) in AWS Elemental MediaStore.
    */
  def putCorsPolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putCorsPolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutCorsPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take effect. For information about how to construct an object lifecycle policy, see Components of an Object Lifecycle Policy.
    */
  def putLifecyclePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putLifecyclePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take effect. For information about how to construct an object lifecycle policy, see Components of an Object Lifecycle Policy.
    */
  def putLifecyclePolicy(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putLifecyclePolicy(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.PutLifecyclePolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts access logging on the specified container. When you enable access logging on a container, MediaStore delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
    */
  def startAccessLogging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startAccessLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts access logging on the specified container. When you enable access logging on a container, MediaStore delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
    */
  def startAccessLogging(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startAccessLogging(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StartAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
    */
  def stopAccessLogging(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopAccessLogging(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
    */
  def stopAccessLogging(params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopAccessLogging(
    params: awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoreMod.MediaStoreNs.StopAccessLoggingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

