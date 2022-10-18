package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUploadsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to list uploads.
    */
  var arn: AmazonResourceName
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The type of upload. Must be one of the following values:   ANDROID_APP   IOS_APP   WEB_APP   EXTERNAL_DATA   APPIUM_JAVA_JUNIT_TEST_PACKAGE   APPIUM_JAVA_TESTNG_TEST_PACKAGE   APPIUM_PYTHON_TEST_PACKAGE   APPIUM_NODE_TEST_PACKAGE   APPIUM_RUBY_TEST_PACKAGE   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE   APPIUM_WEB_PYTHON_TEST_PACKAGE   APPIUM_WEB_NODE_TEST_PACKAGE   APPIUM_WEB_RUBY_TEST_PACKAGE   CALABASH_TEST_PACKAGE   INSTRUMENTATION_TEST_PACKAGE   UIAUTOMATION_TEST_PACKAGE   UIAUTOMATOR_TEST_PACKAGE   XCTEST_TEST_PACKAGE   XCTEST_UI_TEST_PACKAGE   APPIUM_JAVA_JUNIT_TEST_SPEC   APPIUM_JAVA_TESTNG_TEST_SPEC   APPIUM_PYTHON_TEST_SPEC   APPIUM_NODE_TEST_SPEC    APPIUM_RUBY_TEST_SPEC   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC   APPIUM_WEB_PYTHON_TEST_SPEC   APPIUM_WEB_NODE_TEST_SPEC   APPIUM_WEB_RUBY_TEST_SPEC   INSTRUMENTATION_TEST_SPEC   XCTEST_UI_TEST_SPEC  
    */
  var `type`: js.UndefOr[UploadType] = js.undefined
}
object ListUploadsRequest {
  
  inline def apply(arn: AmazonResourceName): ListUploadsRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUploadsRequest]
  }
  
  extension [Self <: ListUploadsRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setType(value: UploadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
