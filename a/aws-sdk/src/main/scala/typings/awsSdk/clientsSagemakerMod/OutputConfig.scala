package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /**
    * Specifies additional parameters for compiler options in JSON format. The compiler options are TargetPlatform specific. It is required for NVIDIA accelerators and highly recommended for CPU compilations. For any other cases, it is optional to specify CompilerOptions.     DTYPE: Specifies the data type for the input. When compiling for ml_* (except for ml_inf) instances using PyTorch framework, provide the data type (dtype) of the model's input. "float32" is used if "DTYPE" is not specified. Options for data type are:   float32: Use either "float" or "float32".   int64: Use either "int64" or "long".    For example, {"dtype" : "float32"}.    CPU: Compilation for CPU supports the following compiler options.    mcpu: CPU micro-architecture. For example, {'mcpu': 'skylake-avx512'}     mattr: CPU flags. For example, {'mattr': ['+neon', '+vfpv4']}       ARM: Details of ARM CPU compilations.    NEON: NEON is an implementation of the Advanced SIMD extension used in ARMv7 processors. For example, add {'mattr': ['+neon']} to the compiler options if compiling for ARM 32-bit platform with the NEON support.      NVIDIA: Compilation for NVIDIA GPU supports the following compiler options.    gpu_code: Specifies the targeted architecture.    trt-ver: Specifies the TensorRT versions in x.y.z. format.    cuda-ver: Specifies the CUDA version in x.y format.   For example, {'gpu-code': 'sm_72', 'trt-ver': '6.0.1', 'cuda-ver': '10.1'}     ANDROID: Compilation for the Android OS supports the following compiler options:    ANDROID_PLATFORM: Specifies the Android API levels. Available levels range from 21 to 29. For example, {'ANDROID_PLATFORM': 28}.    mattr: Add {'mattr': ['+neon']} to compiler options if compiling for ARM 32-bit platform with NEON support.      INFERENTIA: Compilation for target ml_inf1 uses compiler options passed in as a JSON string. For example, "CompilerOptions": "\"--verbose 1 --num-neuroncores 2 -O2\"".  For information about supported compiler options, see  Neuron Compiler CLI.     CoreML: Compilation for the CoreML OutputConfig TargetDevice supports the following compiler options:    class_labels: Specifies the classification labels file name inside input tar.gz file. For example, {"class_labels": "imagenet_labels_1000.txt"}. Labels inside the txt file should be separated by newlines.      EIA: Compilation for the Elastic Inference Accelerator supports the following compiler options:    precision_mode: Specifies the precision of compiled artifacts. Supported values are "FP16" and "FP32". Default is "FP32".    signature_def_key: Specifies the signature to use for models in SavedModel format. Defaults is TensorFlow's default signature def key.    output_names: Specifies a list of output tensor names for models in FrozenGraph format. Set at most one API field, either: signature_def_key or output_names.   For example: {"precision_mode": "FP32", "output_names": ["output:0"]}   
    */
  var CompilerOptions: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CompilerOptions] = js.undefined
  
  /**
    * The Amazon Web Services Key Management Service key (Amazon Web Services KMS) that Amazon SageMaker uses to encrypt your output models with Amazon S3 server-side encryption after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.  The KmsKeyId can be any of the following formats:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * Identifies the S3 bucket where you want Amazon SageMaker to store the model artifacts. For example, s3://bucket-name/key-name-prefix.
    */
  var S3OutputLocation: S3Uri
  
  /**
    * Identifies the target device or the machine learning instance that you want to run your model on after the compilation has completed. Alternatively, you can specify OS, architecture, and accelerator using TargetPlatform fields. It can be used instead of TargetPlatform.
    */
  var TargetDevice: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TargetDevice] = js.undefined
  
  /**
    * Contains information about a target platform that you want your model to run on, such as OS, architecture, and accelerators. It is an alternative of TargetDevice. The following examples show how to configure the TargetPlatform and CompilerOptions JSON strings for popular target platforms:    Raspberry Pi 3 Model B+  "TargetPlatform": {"Os": "LINUX", "Arch": "ARM_EABIHF"},    "CompilerOptions": {'mattr': ['+neon']}    Jetson TX2  "TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "NVIDIA"},    "CompilerOptions": {'gpu-code': 'sm_62', 'trt-ver': '6.0.1', 'cuda-ver': '10.0'}    EC2 m5.2xlarge instance OS  "TargetPlatform": {"Os": "LINUX", "Arch": "X86_64", "Accelerator": "NVIDIA"},    "CompilerOptions": {'mcpu': 'skylake-avx512'}    RK3399  "TargetPlatform": {"Os": "LINUX", "Arch": "ARM64", "Accelerator": "MALI"}    ARMv7 phone (CPU)  "TargetPlatform": {"Os": "ANDROID", "Arch": "ARM_EABI"},    "CompilerOptions": {'ANDROID_PLATFORM': 25, 'mattr': ['+neon']}    ARMv8 phone (CPU)  "TargetPlatform": {"Os": "ANDROID", "Arch": "ARM64"},    "CompilerOptions": {'ANDROID_PLATFORM': 29}   
    */
  var TargetPlatform: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TargetPlatform] = js.undefined
}
object OutputConfig {
  
  inline def apply(S3OutputLocation: S3Uri): OutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputLocation = S3OutputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "CompilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "CompilerOptions", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3OutputLocation(value: S3Uri): Self = StObject.set(x, "S3OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setTargetDevice(value: TargetDevice): Self = StObject.set(x, "TargetDevice", value.asInstanceOf[js.Any])
    
    inline def setTargetDeviceUndefined: Self = StObject.set(x, "TargetDevice", js.undefined)
    
    inline def setTargetPlatform(value: TargetPlatform): Self = StObject.set(x, "TargetPlatform", value.asInstanceOf[js.Any])
    
    inline def setTargetPlatformUndefined: Self = StObject.set(x, "TargetPlatform", js.undefined)
  }
}
