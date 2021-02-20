package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.container.XContainerQuery
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.util.XFlushable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * factory to create filter components.
  *
  * After a generic {@link TypeDetection} an internal type name will be known. Further a generic {@link com.sun.star.frame.FrameLoader} can use this
  * information, to search a suitable filter (may the default filter) at this factory and use it for loading the document into a specified frame.
  *
  * This factory implements read/write access on the underlying configuration set. and further a validate and flush mechanism for more performance and a
  * special query mode can be used here too.
  */
@js.native
trait FilterFactory
  extends XNameContainer
     with XMultiServiceFactory
     with XContainerQuery
     with XFlushable
