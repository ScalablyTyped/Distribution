package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestDNSAnswerResponse extends js.Object {
  /**
    * The Amazon Route 53 name server used to respond to the request.
    */
  var Nameserver: awsDashSdkLib.clientsRoute53Mod.Nameserver
  /**
    * The protocol that Amazon Route 53 used to respond to the request, either UDP or TCP. 
    */
  var Protocol: TransportProtocol
  /**
    * A list that contains values that Amazon Route 53 returned for this resource record set.
    */
  var RecordData: awsDashSdkLib.clientsRoute53Mod.RecordData
  /**
    * The name of the resource record set that you submitted a request for.
    */
  var RecordName: DNSName
  /**
    * The type of the resource record set that you submitted a request for.
    */
  var RecordType: RRType
  /**
    * A code that indicates whether the request is valid or not. The most common response code is NOERROR, meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that describes the error. For a list of possible response codes, see DNS RCODES on the IANA website. 
    */
  var ResponseCode: DNSRCode
}

object TestDNSAnswerResponse {
  @scala.inline
  def apply(
    Nameserver: Nameserver,
    Protocol: TransportProtocol,
    RecordData: RecordData,
    RecordName: DNSName,
    RecordType: RRType,
    ResponseCode: DNSRCode
  ): TestDNSAnswerResponse = {
    val __obj = js.Dynamic.literal(Nameserver = Nameserver, Protocol = Protocol, RecordData = RecordData, RecordName = RecordName, RecordType = RecordType.asInstanceOf[js.Any], ResponseCode = ResponseCode)
  
    __obj.asInstanceOf[TestDNSAnswerResponse]
  }
}

