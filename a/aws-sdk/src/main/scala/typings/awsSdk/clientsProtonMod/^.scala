package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/proton", JSImport.Namespace)
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class ^ ()
  extends StObject
     with Proton {
  def this(options: ClientConfiguration) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  /* CompleteClass */
  var arn: ServiceArn = js.native
  
  /**
    * The time when the service was created.
    */
  /* CompleteClass */
  var createdAt: js.Date = js.native
  
  /**
    * The time when the service was last modified.
    */
  /* CompleteClass */
  var lastModifiedAt: js.Date = js.native
  
  /**
    * The name of the service.
    */
  /* CompleteClass */
  var name: ResourceName = js.native
  
  /**
    * The formatted specification that defines the service.
    */
  /* CompleteClass */
  var spec: SpecContents = js.native
  
  /**
    * The status of the service.
    */
  /* CompleteClass */
  var status: ServiceStatus = js.native
  
  /**
    * The name of the service template.
    */
  /* CompleteClass */
  var templateName: ResourceName = js.native
}
