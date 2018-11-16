package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DirectConnect: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ClientConfiguration = js.native
  /**
     * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateConnectionOnInterconnect(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateConnectionOnInterconnect(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateConnectionOnInterconnect(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocateConnectionOnInterconnectRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use AllocateHostedConnection instead. Creates a hosted connection on an interconnect. Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateConnectionOnInterconnect(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocateConnectionOnInterconnectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateHostedConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateHostedConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateHostedConnection(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocateHostedConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG). Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified interconnect or LAG.  Intended for use by AWS Direct Connect partners only. 
     */
  def allocateHostedConnection(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocateHostedConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
     */
  def allocatePrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
     */
  def allocatePrivateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
     */
  def allocatePrivateVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocatePrivateVirtualInterfaceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a private virtual interface to be owned by the specified AWS account. Virtual interfaces created using this action must be confirmed by the owner using ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state and is not available to handle traffic.
     */
  def allocatePrivateVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocatePrivateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     */
  def allocatePublicVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     */
  def allocatePublicVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     */
  def allocatePublicVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocatePublicVirtualInterfaceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provisions a public virtual interface to be owned by the specified AWS account. The owner of a connection calls this function to provision a public virtual interface to be owned by the specified AWS account. Virtual interfaces created using this function must be confirmed by the owner using ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the confirming state and is not available to handle traffic. When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     */
  def allocatePublicVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AllocatePublicVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     */
  def associateConnectionWithLag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     */
  def associateConnectionWithLag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     */
  def associateConnectionWithLag(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AssociateConnectionWithLagRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can re-associate a connection that's currently associated with a different LAG; however, if removing the connection would cause the original LAG to fall below its setting for minimum number of operational connections, the request fails. Any virtual interfaces that are directly associated with the connection are automatically re-associated with the LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated with the original LAG. For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     */
  def associateConnectionWithLag(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AssociateConnectionWithLagRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
     */
  def associateHostedConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
     */
  def associateHostedConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
     */
  def associateHostedConnection(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AssociateHostedConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address, the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is being migrated.  Intended for use by AWS Direct Connect partners only. 
     */
  def associateHostedConnection(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AssociateHostedConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
     */
  def associateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
     */
  def associateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
     */
  def associateVirtualInterface(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AssociateVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails. Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must be migrated along with their virtual interfaces using AssociateHostedConnection. To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual interface itself or the connection to which the virtual interface is currently associated. Additionally, the requester must own the connection or LAG for the association.
     */
  def associateVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.AssociateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
     */
  def confirmConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
     */
  def confirmConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
     */
  def confirmConnection(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Confirms the creation of the specified hosted connection on an interconnect. Upon creation, the hosted connection is initially in the Ordering state, and remains in this state until the owner confirms creation of the hosted connection.
     */
  def confirmConnection(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     */
  def confirmPrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     */
  def confirmPrivateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     */
  def confirmPrivateVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a private virtual interface created by another AWS account. After the virtual interface owner makes this call, the virtual interface is created and attached to the specified virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     */
  def confirmPrivateVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPrivateVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
     */
  def confirmPublicVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
     */
  def confirmPublicVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
     */
  def confirmPublicVirtualInterface(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts ownership of a public virtual interface created by another AWS account. After the virtual interface owner makes this call, the specified virtual interface is created and made available to handle traffic.
     */
  def confirmPublicVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.ConfirmPublicVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a BGP peer on the specified virtual interface. The BGP peer cannot be in the same address family (IPv4/IPv6) of an existing BGP peer on the virtual interface. You must create a BGP peer for the corresponding address family in order to access AWS resources that also use that address family. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
     */
  def createBGPPeer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a BGP peer on the specified virtual interface. The BGP peer cannot be in the same address family (IPv4/IPv6) of an existing BGP peer on the virtual interface. You must create a BGP peer for the corresponding address family in order to access AWS resources that also use that address family. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
     */
  def createBGPPeer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a BGP peer on the specified virtual interface. The BGP peer cannot be in the same address family (IPv4/IPv6) of an existing BGP peer on the virtual interface. You must create a BGP peer for the corresponding address family in order to access AWS resources that also use that address family. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
     */
  def createBGPPeer(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a BGP peer on the specified virtual interface. The BGP peer cannot be in the same address family (IPv4/IPv6) of an existing BGP peer on the virtual interface. You must create a BGP peer for the corresponding address family in order to access AWS resources that also use that address family. When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses. For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the virtual interface.
     */
  def createBGPPeer(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     */
  def createConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     */
  def createConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     */
  def createConnection(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a connection between a customer network and a specific AWS Direct Connect location. A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. To find the locations for your Region, use DescribeLocations. You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     */
  def createConnection(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
     */
  def createDirectConnectGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
     */
  def createDirectConnectGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
     */
  def createDirectConnectGateway(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the Region in which the virtual interfaces are located, and pass traffic between them.
     */
  def createDirectConnectGateway(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     */
  def createDirectConnectGatewayAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     */
  def createDirectConnectGatewayAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     */
  def createDirectConnectGatewayAssociation(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     */
  def createDirectConnectGatewayAssociation(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
     */
  def createInterconnect(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnect, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
     */
  def createInterconnect(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnect, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnect, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
     */
  def createInterconnect(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateInterconnectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnect, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an interconnect between an AWS Direct Connect partner's network and a specific AWS Direct Connect location. An interconnect is a connection which is capable of hosting other connections. The partner can use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to an AWS Direct Connect router. You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is created. For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the partner.  Intended for use by AWS Direct Connect partners only. 
     */
  def createInterconnect(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateInterconnectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnect, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnect, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
     */
  def createLag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
     */
  def createLag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
     */
  def createLag(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateLagRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single interface. All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint. You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG than AWS Direct Connect can allocate on a single endpoint, no LAG is created. You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the total number of connections). Doing so interrupts the current physical connection or hosted connections, and re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to which the connection terminates. Any virtual interfaces associated with the connection are automatically disassociated and re-associated with the LAG. The connection ID does not change. If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be directly configured.
     */
  def createLag(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreateLagRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
     */
  def createPrivateVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
     */
  def createPrivateVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
     */
  def createPrivateVirtualInterface(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreatePrivateVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to a VGW only provides access to a single VPC within the same Region.
     */
  def createPrivateVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreatePrivateVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
     */
  def createPublicVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
     */
  def createPublicVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
     */
  def createPublicVirtualInterface(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreatePublicVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon S3. When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses are not supported.
     */
  def createPublicVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.CreatePublicVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
     */
  def deleteBGPPeer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
     */
  def deleteBGPPeer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
     */
  def deleteBGPPeer(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the BGP peer on the specified virtual interface with the specified customer address and ASN. You cannot delete the last BGP peer from a virtual interface.
     */
  def deleteBGPPeer(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteBGPPeerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
     */
  def deleteConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
     */
  def deleteConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
     */
  def deleteConnection(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified connection. Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service with them separately.
     */
  def deleteConnection(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
     */
  def deleteDirectConnectGateway(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
     */
  def deleteDirectConnectGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
     */
  def deleteDirectConnectGateway(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct Connect gateway.
     */
  def deleteDirectConnectGateway(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     */
  def deleteDirectConnectGatewayAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     */
  def deleteDirectConnectGatewayAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     */
  def deleteDirectConnectGatewayAssociation(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     */
  def deleteDirectConnectGatewayAssociation(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteDirectConnectGatewayAssociationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def deleteInterconnect(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def deleteInterconnect(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def deleteInterconnect(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def deleteInterconnect(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteInterconnectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
     */
  def deleteLag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
     */
  def deleteLag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
     */
  def deleteLag(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteLagRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted connections.
     */
  def deleteLag(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteLagRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a virtual interface.
     */
  def deleteVirtualInterface(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a virtual interface.
     */
  def deleteVirtualInterface(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a virtual interface.
     */
  def deleteVirtualInterface(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a virtual interface.
     */
  def deleteVirtualInterface(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DeleteVirtualInterfaceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeConnectionLoa(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeConnectionLoa(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeConnectionLoa(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for a connection. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or service provider uses when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeConnectionLoa(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the specified connection or all connections in this Region.
     */
  def describeConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the specified connection or all connections in this Region.
     */
  def describeConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the specified connection or all connections in this Region.
     */
  def describeConnections(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays the specified connection or all connections in this Region.
     */
  def describeConnections(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def describeConnectionsOnInterconnect(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def describeConnectionsOnInterconnect(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def describeConnectionsOnInterconnect(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionsOnInterconnectRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeHostedConnections instead. Lists the connections that have been provisioned on the specified interconnect.  Intended for use by AWS Direct Connect partners only. 
     */
  def describeConnectionsOnInterconnect(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeConnectionsOnInterconnectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
     */
  def describeDirectConnectGatewayAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
     */
  def describeDirectConnectGatewayAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
     */
  def describeDirectConnectGatewayAssociations(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway. If you specify both, the response contains the association between the Direct Connect gateway and the virtual private gateway.
     */
  def describeDirectConnectGatewayAssociations(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAssociationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
     */
  def describeDirectConnectGatewayAttachments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
     */
  def describeDirectConnectGatewayAttachments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
     */
  def describeDirectConnectGatewayAttachments(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response contains the attachment between the Direct Connect gateway and the virtual interface.
     */
  def describeDirectConnectGatewayAttachments(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewayAttachmentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
     */
  def describeDirectConnectGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
     */
  def describeDirectConnectGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
     */
  def describeDirectConnectGateways(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect gateways are not returned.
     */
  def describeDirectConnectGateways(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeDirectConnectGatewaysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
     */
  def describeHostedConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
     */
  def describeHostedConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
     */
  def describeHostedConnections(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeHostedConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group (LAG).  Intended for use by AWS Direct Connect partners only. 
     */
  def describeHostedConnections(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeHostedConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connections, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeInterconnectLoa(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeInterconnectLoa(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeInterconnectLoa(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deprecated. Use DescribeLoa instead. Gets the LOA-CFA for the specified interconnect. The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeInterconnectLoa(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectLoaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     */
  def describeInterconnects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnects, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     */
  def describeInterconnects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnects, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnects, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     */
  def describeInterconnects(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnects, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     */
  def describeInterconnects(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeInterconnectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnects, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Interconnects, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     */
  def describeLags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     */
  def describeLags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lags, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     */
  def describeLags(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeLagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     */
  def describeLags(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeLagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lags, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lags, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeLoa(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Loa, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeLoa(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Loa, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Loa, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeLoa(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeLoaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Loa, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG). The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at AWS Direct Connect Locations in the AWS Direct Connect User Guide.
     */
  def describeLoa(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeLoaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Loa, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Loa, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected when calling CreateConnection or CreateInterconnect.
     */
  def describeLocations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Locations, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected when calling CreateConnection or CreateInterconnect.
     */
  def describeLocations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Locations, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Locations, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the tags associated with the specified AWS Direct Connect resources.
     */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the tags associated with the specified AWS Direct Connect resources.
     */
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the tags associated with the specified AWS Direct Connect resources.
     */
  def describeTags(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the tags associated with the specified AWS Direct Connect resources.
     */
  def describeTags(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the virtual private gateways owned by the AWS account. You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
     */
  def describeVirtualGateways(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualGateways, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the virtual private gateways owned by the AWS account. You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
     */
  def describeVirtualGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualGateways, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualGateways, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
     */
  def describeVirtualInterfaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterfaces, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
     */
  def describeVirtualInterfaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterfaces, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterfaces, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
     */
  def describeVirtualInterfaces(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeVirtualInterfacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterfaces, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is returned. A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer network.
     */
  def describeVirtualInterfaces(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DescribeVirtualInterfacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterfaces, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterfaces, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
     */
  def disassociateConnectionFromLag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
     */
  def disassociateConnectionFromLag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
     */
  def disassociateConnectionFromLag(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DisassociateConnectionFromLagRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established as a standalone connection (the connection is not deleted; to delete the connection, use the DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically converted to an interconnect. If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational connections, the request fails, except when it's the last member of the LAG. If all connections are disassociated, the LAG continues to exist as an empty LAG with no physical connections. 
     */
  def disassociateConnectionFromLag(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.DisassociateConnectionFromLagRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Connection, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
     */
  def tagResource(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the resource, this action updates its value.
     */
  def tagResource(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from the specified AWS Direct Connect resource.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from the specified AWS Direct Connect resource.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from the specified AWS Direct Connect resource.
     */
  def untagResource(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from the specified AWS Direct Connect resource.
     */
  def untagResource(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
     */
  def updateLag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
     */
  def updateLag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
     */
  def updateLag(params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UpdateLagRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the attributes of the specified link aggregation group (LAG). You can update the following attributes:   The name of the LAG.   The value for the minimum number of connections that must be operational for the LAG itself to be operational.    When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you update this value and the number of operational connections falls below the specified value, the LAG automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as it could force the LAG down if it is set higher than the current number of operational connections.
     */
  def updateLag(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UpdateLagRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.Lag, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
     */
  def updateVirtualInterfaceAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
     */
  def updateVirtualInterfaceAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
     */
  def updateVirtualInterfaceAttributes(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UpdateVirtualInterfaceAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the specified attributes of the specified virtual private interface. Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo frames, call DescribeVirtualInterfaces.
     */
  def updateVirtualInterfaceAttributes(
    params: awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.UpdateVirtualInterfaceAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDirectconnectMod.DirectConnectNs.VirtualInterface, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

