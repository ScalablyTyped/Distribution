package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stream which allows writing the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataOutputStream} service; furthermore, the stream needs to be chained
  * to a {@link XMarkableStream} . Therefore, it also provides the {@link XMarkableStream} interface, but it delegates the calls to the chained object.
  * The written objects are held until this instance is destroyed. The references to the objects are written as four-byte integers and begin at 1. Data
  * format is written:
  *
  * `; short   InfoLength; long    ObjectReference // 0 indicates no object; UTF     ServiceName     // length of 0 indicates this is only a reference;
  * long    ObjectLength    // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData      // the data of the
  * object; `
  */
trait ObjectOutputStream
  extends XObjectOutputStream
     with XActiveDataSource
     with XConnectable

