package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stream which allows reading the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataInputStream} service. It must be chained to an {@link
  * XMarkableStream} . Therefore, it provides the {@link XMarkableStream} interface, and delegates the calls to the chained object.
  *
  * The written objects are held until this instance is destroyed. The references to the objects are read as four-byte integers. Data format reads:
  *
  * `; short   InfoLength; long    ObjectReference  // 0 indicates no object; UTF     ServiceName      // length of 0 indicates this is only a reference;
  * long    ObjectLength     // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData       // the data of the
  * object; ...                      // skipping additional data; `
  */
trait ObjectInputStream
  extends XObjectInputStream
     with XActiveDataSink
     with XConnectable
     with XMarkableStream

