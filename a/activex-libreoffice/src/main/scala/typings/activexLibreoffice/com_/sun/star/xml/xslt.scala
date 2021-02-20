package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataControl
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.io.XStreamListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xslt {
  
  /**
    * Get XSLT filter transformer supporting XSLT 2.0.
    * @since LibreOffice 4.0
    */
  @js.native
  trait XSLT2Transformer extends XXSLTTransformer {
    
    def create(args: SeqEquiv[_]): Unit = js.native
  }
  object XSLT2Transformer {
    
    @scala.inline
    def apply(
      InputStream: XInputStream,
      OutputStream: XOutputStream,
      acquire: () => Unit,
      addListener: XStreamListener => Unit,
      create: SeqEquiv[_] => Unit,
      getInputStream: () => XInputStream,
      getOutputStream: () => XOutputStream,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeListener: XStreamListener => Unit,
      setInputStream: XInputStream => Unit,
      setOutputStream: XOutputStream => Unit,
      start: () => Unit,
      terminate: () => Unit
    ): XSLT2Transformer = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), create = js.Any.fromFunction1(create), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[XSLT2Transformer]
    }
    
    @scala.inline
    implicit class XSLT2TransformerMutableBuilder[Self <: XSLT2Transformer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: SeqEquiv[_] => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Get unspecified XSLT filter transformer.
    *
    * It is not safe to expect support for any features except XSLT 1.0 .
    * @since LibreOffice 4.0
    */
  @js.native
  trait XSLTTransformer extends XXSLTTransformer {
    
    def create(args: SeqEquiv[_]): Unit = js.native
  }
  object XSLTTransformer {
    
    @scala.inline
    def apply(
      InputStream: XInputStream,
      OutputStream: XOutputStream,
      acquire: () => Unit,
      addListener: XStreamListener => Unit,
      create: SeqEquiv[_] => Unit,
      getInputStream: () => XInputStream,
      getOutputStream: () => XOutputStream,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeListener: XStreamListener => Unit,
      setInputStream: XInputStream => Unit,
      setOutputStream: XOutputStream => Unit,
      start: () => Unit,
      terminate: () => Unit
    ): XSLTTransformer = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), create = js.Any.fromFunction1(create), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[XSLTTransformer]
    }
    
    @scala.inline
    implicit class XSLTTransformerMutableBuilder[Self <: XSLTTransformer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: SeqEquiv[_] => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An interface for XSLT transformers.
    * @since LibreOffice 4.0
    */
  @js.native
  trait XXSLTTransformer
    extends XActiveDataControl
       with XActiveDataSink
       with XActiveDataSource
       with XInitialization
  object XXSLTTransformer {
    
    @scala.inline
    def apply(
      InputStream: XInputStream,
      OutputStream: XOutputStream,
      acquire: () => Unit,
      addListener: XStreamListener => Unit,
      getInputStream: () => XInputStream,
      getOutputStream: () => XOutputStream,
      initialize: SeqEquiv[_] => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeListener: XStreamListener => Unit,
      setInputStream: XInputStream => Unit,
      setOutputStream: XOutputStream => Unit,
      start: () => Unit,
      terminate: () => Unit
    ): XXSLTTransformer = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), setInputStream = js.Any.fromFunction1(setInputStream), setOutputStream = js.Any.fromFunction1(setOutputStream), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[XXSLTTransformer]
    }
  }
}
