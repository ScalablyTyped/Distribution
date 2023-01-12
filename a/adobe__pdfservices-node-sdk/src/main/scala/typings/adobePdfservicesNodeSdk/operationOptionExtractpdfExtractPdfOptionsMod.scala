package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.csv
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.figures
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.tables
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.text
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOptionExtractpdfExtractPdfOptionsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/extractpdf/extract-pdf-options", "ExtractPDFOptionsBuilder")
  @js.native
  open class ExtractPDFOptionsBuilder () extends StObject {
    
    /**
      * Boolean specifying whether to add character level bounding boxes to output json
      */
    def addCharInfo(element: Boolean): ExtractPDFOptionsBuilder = js.native
    
    /**
      * Sets the elements to extract - like text and/or tables.
      */
    def addElementsToExtract(elements: js.Array[ExtractElementType]): ExtractPDFOptionsBuilder = js.native
    
    /**
      * Sets the renditions to extract - like tables and/or figures.
      */
    def addElementsToExtractRenditions(elements: js.Array[ExtractElementType]): ExtractPDFOptionsBuilder = js.native
    
    /**
      * Adds the table structure format (currently csv only) for extracting structured information.
      */
    def addTableStructureFormat(element: TableStructureType): ExtractPDFOptionsBuilder = js.native
    
    /**
      * Returns a new {@link ExtractPdfOptions} instance built from the current state of this builder.
      */
    def build(): ExtractPdfOptions = js.native
    
    /**
      * Boolean specifying whether to get styling info of text
      */
    def getStylingInfo(element: Boolean): ExtractPDFOptionsBuilder = js.native
  }
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/extractpdf/extract-pdf-options", "ExtractPdfOptions")
  @js.native
  open class ExtractPdfOptions protected () extends StObject {
    def this(builder: ExtractPdfOptions) = this()
    
    var elementsToExtract: js.Array[ExtractElementType] = js.native
    
    var getCharBounds: Boolean = js.native
    
    var includeStyling: Boolean = js.native
    
    var renditionsToExtract: js.Array[ExtractRenditionsElementType] = js.native
    
    var tableOutputFormat: TableStructureType = js.native
    
    def validate(): Boolean = js.native
  }
  
  trait ExtractElementType extends StObject {
    
    /**
      * Represents Table elements to extract in the JSON.
      */
    var TABLES: tables
    
    /**
      * Represents Text elements to extract in the JSON
      */
    var TEXT: text
  }
  object ExtractElementType {
    
    inline def apply(): ExtractElementType = {
      val __obj = js.Dynamic.literal(TABLES = "tables", TEXT = "text")
      __obj.asInstanceOf[ExtractElementType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractElementType] (val x: Self) extends AnyVal {
      
      inline def setTABLES(value: tables): Self = StObject.set(x, "TABLES", value.asInstanceOf[js.Any])
      
      inline def setTEXT(value: text): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtractRenditionsElementType extends StObject {
    
    /**
      * Represents png renditions of Figures to generate from the PDF
      */
    var FIGURES: figures
    
    /**
      * Represents png renditions of Tables to generate from the PDF
      */
    var TABLES: tables
  }
  object ExtractRenditionsElementType {
    
    inline def apply(): ExtractRenditionsElementType = {
      val __obj = js.Dynamic.literal(FIGURES = "figures", TABLES = "tables")
      __obj.asInstanceOf[ExtractRenditionsElementType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractRenditionsElementType] (val x: Self) extends AnyVal {
      
      inline def setFIGURES(value: figures): Self = StObject.set(x, "FIGURES", value.asInstanceOf[js.Any])
      
      inline def setTABLES(value: tables): Self = StObject.set(x, "TABLES", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableStructureType extends StObject {
    
    /**
      * Represents CSV format for exporting extracted Table Data
      */
    var CSV: csv
    
    /**
      * Represents XLSX format for exporting extracted Table Data
      */
    var XLSX: xlsx
  }
  object TableStructureType {
    
    inline def apply(): TableStructureType = {
      val __obj = js.Dynamic.literal(CSV = "csv", XLSX = "xlsx")
      __obj.asInstanceOf[TableStructureType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableStructureType] (val x: Self) extends AnyVal {
      
      inline def setCSV(value: csv): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
      
      inline def setXLSX(value: xlsx): Self = StObject.set(x, "XLSX", value.asInstanceOf[js.Any])
    }
  }
}
